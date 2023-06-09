package com.example.ex5.controller;


import com.example.ex5.model.User;
import com.example.ex5.repo.UserRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    private final UserRepo userRepo;

    public UserController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }
    @GetMapping
    public List<User> getAllUsers(){
        return userRepo.findAll();
    }

    @PostMapping
    public String postUser(@RequestBody User user){
        userRepo.save(user);
        return user + " added";
    }

    @PutMapping("/{id}")
    public User putUser(@PathVariable Long id, @RequestBody User user){
        return userRepo.updateUserById(id,user);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id){
        userRepo.deleteUserById(id);
        return "user with id "+id+"was deleted";
    }


}
