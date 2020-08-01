package com.ding.controller;

import com.ding.pojo.User;
import com.ding.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/User")
public class UserController {
    private static final Logger logger = Logger.getLogger(UserController.class);

    @Resource
    private UserService service;
    /**
     *返回user对象信息给page1.jsp处理，然后在前端页面展示
     */
    @RequestMapping("/getUser")
    public @ResponseBody Object getUser() {
        System.out.println("访问page1的后台。。。");
        logger.info("UserController->getUser->start");
        ModelAndView mav = new ModelAndView("page1");
        List<User> users = service.getAllUser();
        System.out.println(users);
        mav.addObject("user", users.get(3));
        logger.info("UserController->getUser->end users = " + users);
        return  users;
//        return "page1"; //跳转到.jsp结尾的对应文件（page1.jsp）,此时返回值是String
    }
}
