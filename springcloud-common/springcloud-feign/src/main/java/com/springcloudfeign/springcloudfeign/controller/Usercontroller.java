package com.springcloudfeign.springcloudfeign.controller;

import com.springcloudfeign.springcloudfeign.api.UserApiFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName:
 * @Description:TODO
 * @Author: zwzheng
 * @Date: 20190717
 */
@RestController
@RequestMapping("/user")
public class Usercontroller {
    @Autowired
    UserApiFeign userApiFeign;
    @RequestMapping("/list")
    public String getUser(){
        String result = userApiFeign.getListUser();
        return result;

    }

}
