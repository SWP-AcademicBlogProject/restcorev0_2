/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group8swp.fptblog.controller;

import com.group8swp.fptblog.database.DatabaseTest;
import com.group8swp.fptblog.model.UserDTO;
import com.group8swp.fptblog.repositories.UserRepository;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author pc
 */
@Controller
public class RegisterController {
     private static final Logger logger = LoggerFactory.getLogger(DatabaseTest.class);
     private static final String SUCCESS = "profile";
    
    @Autowired
    private UserRepository repository;
    
    
    @RequestMapping(value = "/create")
    public String registerController(
            HttpSession session, Model model,
           @RequestParam(value = "userID") String userid,
           @RequestParam(value = "FullName") String username,
           @RequestParam(value = "Password") String password,
           @RequestParam(value = "roleID") String roleID,
           @RequestParam(value = "confirm") String confirm
    ) {
        try {
        List<UserDTO> founduser = repository.findByUserID(userid);
        if (founduser.size()!=0) {
            
            model.addAttribute("useridError", "Existed user ID !");
            return "register";
            
        }  
        List<UserDTO> foundusername = repository.findByUserName(username);
        if (foundusername.size()!=0) {
            model.addAttribute("usernameError", "Existed user name !");
            return "register";
        } if (!password.equals(confirm)) {
            model.addAttribute("confirmError", "password and confirm password does not match !");
            return "register";
        }
        }catch (Exception e) {
            logger.info(e.toString());
        }
        
        String major = userid.substring(0, 2);
        
        UserDTO newAccount = new UserDTO(userid, username, password, roleID, null, 0,
                0, 1, null, password, null);
        
        logger.info("create new account" + repository.save(newAccount));
        model.addAttribute("user", newAccount);
        
         
        return "profile";
    }
}
