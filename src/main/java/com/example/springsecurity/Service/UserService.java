//package com.example.springsecurity.Service;
//
//import com.example.springsecurity.Model.Users;
//import com.example.springsecurity.Repository.UserRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserService {
//
//    @Autowired
//    private UserRepo userRepo;
//
//    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12    );
//
//    public Users register(Users users) {
//        users.setPassword(encoder.encode(users.getPassword()));
//        return userRepo.save(users);
//    }
////
////    public String verify(Users users) {
////    }
//}
