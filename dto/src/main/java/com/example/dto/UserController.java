package com.example.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getall")
    public List<UserDTO> getAllUsers() {
    	return userService.getAllUsers(); }
   
    
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
    	userService. createUser(user);
        return new ResponseEntity<User>(HttpStatus.CREATED);
    }


}
