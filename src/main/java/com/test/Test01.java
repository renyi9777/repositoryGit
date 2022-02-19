package com.test;

import com.service.DeptService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test01 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        DeptService deptServiceImpl = (DeptService) classPathXmlApplicationContext.getBean("deptServiceImpl");
        List<Map<String, Object>> maps = deptServiceImpl.selectDept8();
        for (Map<String, Object> map : maps) {
            Set<String> strings = map.keySet();
            for (String s : strings) {
                System.out.println(s);
                System.out.println(map.get(s));
            }
        }
    }
}
