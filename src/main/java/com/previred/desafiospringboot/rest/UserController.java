package com.previred.desafiospringboot.rest;

import com.previred.desafiospringboot.model.CustomUser;
import com.previred.desafiospringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public ResponseEntity<List<CustomUser>> getAllUsers() {

        List<CustomUser> customUsers = userService.getAllUsers();
        return new ResponseEntity<>(customUsers, HttpStatus.OK);
    }
}
