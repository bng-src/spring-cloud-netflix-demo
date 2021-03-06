package com.bgsrc.spring.cloud.user.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/user")
public interface UserServer {

    String serverName = "user-server";

    @GetMapping("/{uid}")
    String getUserInfo(@PathVariable("uid") String uid);
}
