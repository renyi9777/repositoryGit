package com.handle;

import com.exception.AgeException;
import com.exception.NameException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionHandle {
    @ExceptionHandler(value = NameException.class)
    public ModelAndView name(Exception e){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg",e.getMessage());
        modelAndView.addObject("exc",e);
        modelAndView.setViewName("exception");
        return modelAndView;
    }
    @ExceptionHandler(value = AgeException.class)
    public ModelAndView age(Exception e){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg",e.getMessage());
        modelAndView.addObject("exc",e);
        modelAndView.setViewName("exception");
        return modelAndView;
    }
    @ExceptionHandler
    public ModelAndView err(Exception e){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg",e.getMessage());
        modelAndView.addObject("exc",e);
        modelAndView.setViewName("exception");
        return modelAndView;
    }
}
