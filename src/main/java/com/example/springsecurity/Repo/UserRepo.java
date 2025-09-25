package com.example.springsecurity.Repo;

import com.example.springsecurity.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {

    @Query(value = "select * from users where username = ?1", nativeQuery = true)
    Users findByUsername(String username);
}
