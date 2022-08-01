package com.mytry.user.service;
import com.mytry.user.model.user;
import com.mytry.user.repo.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService {
    @Autowired
    userRepo userrepo;

    public user saveUser(user user){
        return userRepo.save();
        return user;
    }

    public List<user> getAllUsers(){

        return userRepo.findAll();
    }

    public String deleteuser(Integer id){
        userRepo.deleteById(id);
        return "deleted";
    }

    public String updateUser(user user) {
        userRepo.save(user);
        return user.getName()+" updated";
    }
}