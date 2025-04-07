package com.hele.wsms.example.wsms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hele.wsms.example.wsms.domain.Login;
import com.hele.wsms.example.wsms.repository.LoginRepo;

@Service
public class LoginService {


   @Autowired
   private LoginRepo rep;


   public Login log(String username, String password) {
       Login user = rep.findByUsernameAndPassword(username, password);
       return user;
   }
}
