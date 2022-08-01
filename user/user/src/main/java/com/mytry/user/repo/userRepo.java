package com.mytry.user.repo;


import com.mytry.user.model.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepo extends JpaRepository<user,Integer> {

}
