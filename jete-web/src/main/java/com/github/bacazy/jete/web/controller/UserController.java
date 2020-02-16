package com.github.bacazy.jete.web.controller;

import com.github.bacazy.jete.web.common.Response;
import com.github.bacazy.jete.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public Response getAll() {
        return Response.builder().value(userService.selectAll()).build();
    }
}
