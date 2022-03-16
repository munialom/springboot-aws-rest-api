package com.ctecx.springrest.controllers;

import com.ctecx.springrest.service.UserService;
import com.ctecx.springrest.usermodel.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<User> addUser(@RequestBody User user) {

        return  new ResponseEntity<>(userService.saveUser(user),HttpStatus.CREATED);
    }
}
