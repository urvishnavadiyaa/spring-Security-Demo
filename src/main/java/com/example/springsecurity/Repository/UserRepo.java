//package com.example.springsecurity.Repository;
//
//import com.example.springsecurity.Model.Users;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.stereotype.Repository;
//
//import java.util.Optional;
//
//@Repository
//public interface UserRepo extends JpaRepository<Users, Integer> {
//
//    @Query(value = "select * from users where user_name = ?1", nativeQuery = true)
//    Users findByUsername(String username);
//}
