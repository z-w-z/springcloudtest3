package com.springcloudribbon.springcloudribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
    RestTemplate template;

    @RequestMapping("/getlist")
    public String gettemplate(){
        String result = template.getForObject("http://localhost/common-user/user/list",String.class);
        return result;
    }
}
