package com.mytry.user.service;
import com.mytry.user.model.user;
import com.mytry.user.repo.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService {
    @Autowired
    userRepo userRepo;

    public user saveUser(user user){
        return userRepo.save(user);
        //return user;
    }

    public List<user> getAllUsers(){

        return userRepo.findAll();
    }

    public String deleteuser(Integer Id){
        userRepo.deleteById(Id);
        return "deleted";
    }

    public String updateUser(user user) {
        userRepo.save(user);
        return user.getName()+" updated";
    }
}