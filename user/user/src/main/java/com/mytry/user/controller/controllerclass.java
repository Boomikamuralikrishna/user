package com.mytry.user.controller;

import com.mytry.user.model.user;
import com.mytry.user.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mytry")
public class controllerclass {
    @Autowired
    userService userservice;
    @GetMapping("/user/all")
    public ResponseEntity<?> getUsers(){
        return new ResponseEntity<>(userservice.getAllUsers(), HttpStatus.OK);
    }

    @PostMapping("/user/save/{id}/{name}/{phone}/{email}/{address}")
    public ResponseEntity<?> saveUser(@PathVariable("id") Integer id,  @PathVariable("name") String name, @PathVariable("phone") String phone, @PathVariable("email") String email, @PathVariable("address") String address) {

        return new ResponseEntity<>("" + "been added "+userservice.saveUser(new user(id,name,phone,email,address)),HttpStatus.CREATED);
    }

    @DeleteMapping("/user/delete/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable("id") Integer id){
        return new ResponseEntity<>(userservice.deleteuser(id),HttpStatus.OK);
    }

    @PutMapping("/user/update/{id}/{name}/{phone}/{email}/{address}")
    public ResponseEntity<?> updateUser(@PathVariable("id") Integer id,  @PathVariable("name") String name, @PathVariable("phone") String phone, @PathVariable("email") String email, @PathVariable("address") String address) {
        return new ResponseEntity<>(" added "+userservice.updateUser(new user(id,name,email,phone,address)),HttpStatus.CREATED);
    }
}
