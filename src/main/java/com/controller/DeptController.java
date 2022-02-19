package com.controller;

import com.exception.AgeException;
import com.exception.MyException;
import com.exception.NameException;
import com.obj.Dept;
import com.service.DeptService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class DeptController {
    @Resource
    private DeptService deptService;

    @RequestMapping(value = "addDept", method = RequestMethod.POST)
    public ModelAndView addDept(Dept dept) {
        ModelAndView modelAndView = new ModelAndView();
        String s = "注册失败";
        int i = deptService.addDept(dept);
        if (i > 0) {
            s = dept.getDeptno() + dept.getDname() + dept.getLoc() + "注册成功";
        }
        modelAndView.addObject("tips", s);
        modelAndView.setViewName("show");
        return modelAndView;
    }

    @RequestMapping(value = "findDept")
    @ResponseBody
    public List<Dept> findDept() {
        return deptService.findStudent();
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public ModelAndView test02(String name, Integer age) throws MyException {
        if (!"renyi".equals(name)) {
            throw new NameException("您的名字有误");
        }
        if (age > 80 || age < 0) {
            throw new AgeException("您的年龄有误");
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", name);
        modelAndView.addObject("age", age);
        modelAndView.setViewName("show");
        return modelAndView;
    }

    @RequestMapping(value = "show")
    public String test03() {

        return "show";
    }

    @RequestMapping(value = "getLogin")
    public String test04(HttpServletRequest httpServletRequest) {
        HttpSession session = httpServletRequest.getSession(false);
        session.setAttribute("name","renyi");
        return "getLogin";
    }
    @RequestMapping(value = "lostLogin")
    public ModelAndView test05(HttpServletRequest httpServletRequest) {
        ModelAndView modelAndView = new ModelAndView();
        HttpSession session = httpServletRequest.getSession(false);
        Object name = session.getAttribute("name");
        if (name!=null){
            session.removeAttribute("name");
            modelAndView.addObject("msg","您已成功退出");
        }else {
            modelAndView.addObject("msg","您还有没登录呢");
        }
        modelAndView.setViewName("lostLogin");
        return modelAndView;
    }
}
