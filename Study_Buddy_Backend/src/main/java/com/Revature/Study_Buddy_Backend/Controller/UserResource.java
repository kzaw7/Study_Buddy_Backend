package com.Revature.Study_Buddy_Backend.Controller;

import com.Revature.Study_Buddy_Backend.Model.User;
import com.Revature.Study_Buddy_Backend.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/users")
public class UserResource {

    @Autowired
    private UserService userService;
    @GetMapping
    public ResponseEntity<List<User>>getAllUser(){
       return new ResponseEntity<>(userService.getAllUser(),HttpStatus.OK);

    }
    @GetMapping("/{userid}")
    public ResponseEntity<User>getUserById(@PathVariable("userid")Long id){
        User user= userService.getUserById(id);
        if(user!=null){
            return new ResponseEntity<>(user,HttpStatus.OK);
        }

         return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }
    @PostMapping("/add")
    public ResponseEntity<User>addUser(@RequestBody User user){
        return new ResponseEntity<>(userService.addUser(user),HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<User>updateUser(@RequestBody User user) {

        User userexist = userService.getUserById(user.getUserid());
        if (userexist != null) {
            return new ResponseEntity<>(userService.updateUser(user), HttpStatus.OK);

        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @DeleteMapping("/delete/{id}")

   public ResponseEntity<?>deleteUser(@PathVariable("id") Long id){
        User userexist1=userService.getUserById(id);
        if(userexist1!=null) {
            userService.deleteUser(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }




}
