package com.dio.santader_dev_week_2025.controller;


import com.dio.santader_dev_week_2025.domain.model.User;
import com.dio.santader_dev_week_2025.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {


    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){

        User user = userService.findById(id);

        return ResponseEntity.ok(user);
    }

    @PostMapping
    public ResponseEntity<User> create(@RequestBody User user){

        User userNew = userService.create(user);

        return ResponseEntity.ok().body(userNew);
    }
}
