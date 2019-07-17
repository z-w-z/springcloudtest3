package com.commonuser.commonuser.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName:
 * @Description:TODO
 * @Author: zwzheng
 * @Date: 20190717
 */
@RestController
@RequestMapping("/user")
public class Usercontroller {

    @Value("${server.port}")
    String serverPort;

    @RequestMapping("/list")
    public String getListUser(){
        List<Map<String, Object>> users = new ArrayList<Map<String, Object>>();
        Map<String, Object> user = new HashMap<>();
        for(int i = 0; i<5;i++){
            user.put("id",i);
            user.put("name","靓仔王"+i);
            users.add(user);
        }
        return "服务器端口号：   " + serverPort + "   |   用户信息：   " + users.toString();
    }
}
