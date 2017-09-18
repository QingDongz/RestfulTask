package cn.summerwaves.controller;

import cn.summerwaves.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by summerwaves on 2017/9/11.
 */
@Controller
public class UserController {



    @RequestMapping(value = "/getdate", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView getDate() {
        SimpleDateFormat tempDate = new SimpleDateFormat("yyyy-MM-dd");
        String dateTime = tempDate.format(new java.util.Date());
        String message = "String传递测试";
        List<User> us = new ArrayList<User>();
        us.add(new User("sdad","dasd",1));
        ModelAndView mv = new ModelAndView();
        mv.setViewName("getuser");
        mv.addObject("users", us);
        mv.addObject("date", dateTime);
        mv.addObject("message", message);
        return mv;
    }
}
