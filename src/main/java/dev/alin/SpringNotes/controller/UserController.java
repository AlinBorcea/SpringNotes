package dev.alin.SpringNotes.controller;

import dev.alin.SpringNotes.entity.User;
import dev.alin.SpringNotes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService service;

    @RequestMapping("/users")
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

    @RequestMapping("/users/{id}")
    public User getUser(Long id) {
        return service.getUserById(id);
    }

    @PostMapping("/users")
    public void addUser(@RequestBody User user) {
        service.addUser(user);
    }

    @PutMapping("users/{id}")
    public void updateUser(@PathVariable Long id, @RequestBody User user) {
        service.updateUser(id, user);
    }

    @DeleteMapping("users/{id}")
    public void deleteUser(@PathVariable Long id) {
        service.deleteUser(id);
    }

}
