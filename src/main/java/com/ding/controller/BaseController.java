package com.ding.controller;

import com.ding.enums.BaseExceptionEnum;
import com.ding.exception.BaseException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/Base")
public class BaseController {
    @RequestMapping("/action")
    public @ResponseBody Object BaseAction(){
        System.out.println("BaseAction");
        char ch=(char)(Math.random()*128);
        if(ch>='A'&&ch<='Z') {
            System.out.println("Yes!");
        }else {
            System.out.println("No!");
            throw  new BaseException(BaseExceptionEnum.SYSTEM_BUSY);
        }
        return "BaseAction";
    }


}
