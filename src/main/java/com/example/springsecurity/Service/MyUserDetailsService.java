//package com.example.springsecurity.Service;
//
//import com.example.springsecurity.Model.UserDetail;
//import com.example.springsecurity.Model.Users;
//import com.example.springsecurity.Repository.UserRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class MyUserDetailsService implements UserDetailsService {
//
//    @Autowired
//    private UserRepo userRepo;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Users user = userRepo.findByUsername(username);
//        if (user == null) {
//            System.out.println("user not found");
//            throw new UsernameNotFoundException("user not found");
//        }
//        return new UserDetail(user);
//    }
//}