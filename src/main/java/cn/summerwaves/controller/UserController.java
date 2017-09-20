package cn.summerwaves.controller;

import cn.summerwaves.model.User;
import cn.summerwaves.service.IUserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;


/**
 * Created by summerwaves on 2017/9/11.
 */
@Controller
public class UserController {

    @Resource
    private IUserService userService;

/*    @RequestMapping(value = "/getdate", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView getDate() {
        SimpleDateFormat tempDate = new SimpleDateFormat("yyyy-MM-dd");
        String dateTime = tempDate.format(new java.util.Date());
        String message = "String传递测试";
        List<User> us = new ArrayList<User>();
        us.add(new User("sdad","dasd","das"));
        ModelAndView mv = new ModelAndView();
        mv.setViewName("getuser");
        mv.addObject("users", us);
        mv.addObject("date", dateTime);
        mv.addObject("message", message);
        return mv;
    }*/



    @RequestMapping(value = "/users" , method = RequestMethod.GET)
    public String toUserList(HttpServletRequest request) throws IOException {
        List<User> users = userService.getAllUsers();
        request.getSession().setAttribute("list",users);
        return  "userlist";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String toRegister() {
        return "register";
    }

    @RequestMapping(value = "/modify", method = RequestMethod.GET)
    public String toModify() {
        return "MDPassword";
    }

    @RequestMapping(value = "/users",method = RequestMethod.POST)
    public ModelAndView register(@Param("username")String username,@Param("password")String password,@Param("sex")String sex) throws IOException {
        User user = new User();
        if (username != null) {
            user.setUsername(username);
            user.setPassword(password);
            user.setSex(sex);
            userService.insertUser(user);
            return new ModelAndView("registerSuccess","username",user.getUsername());
        }
        return new ModelAndView("registerFailure");
    }
    @RequestMapping(value = "/users/{username}", method = RequestMethod.DELETE , produces = "application/json; charset=utf-8")
    @ResponseBody
    public String deleteUser(@PathVariable("username")String username) throws IOException {
        userService.deleteUser(username);
        return "删除用户成功";
    }

    @RequestMapping(value = "/users/{username}", method = RequestMethod.PUT , produces = "application/json; charset=utf-8")
    @ResponseBody
    public String modifyPassword(@PathVariable("username")String username,@Param("password")String password) throws IOException {
        User user = userService.getUserByUserName(username);
        user.setPassword(password);
        userService.modifyPassword(user);
        return "修改密码成功";
    }


    @RequestMapping(value = "/users/{username}", method = RequestMethod.GET)
    public String showUser(@PathVariable("username")String username,HttpServletRequest request) throws IOException {
        User user = userService.getUserByUserName(username);
        request.getSession().setAttribute("user",user);
        return "showUser";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() throws IOException {

        return "registerSuccess";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "welcome";
    }
}
