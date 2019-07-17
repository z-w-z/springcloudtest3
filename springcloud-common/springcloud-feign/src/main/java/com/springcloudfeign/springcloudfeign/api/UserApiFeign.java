package com.springcloudfeign.springcloudfeign.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName:
 * @Description:TODO
 * @Author: zwzheng
 * @Date: 20190717
 */
@FeignClient("common-user")
public interface UserApiFeign {

    @GetMapping("/user/list")
    public  String getListUser();
}
