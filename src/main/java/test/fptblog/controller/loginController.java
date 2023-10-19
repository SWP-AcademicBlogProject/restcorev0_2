/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.fptblog.controller;

import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import test.fptblog.model.userModel;
import test.fptblog.repositories.userRepository;

/**
 *
 * @author pc
 */
@Controller
public class loginController {

    @Autowired
    private userRepository repository;

    @RequestMapping(value = "/login")
    public String login(HttpSession session, 
            @RequestParam(value = "username") String username,
            @RequestParam(value = "password") String password) {

        String failed = "loginfailed";
        String success = "viewforum";

        String result = null;

        List<userModel> founduser = repository.findByUserName(username);
        if (founduser.isEmpty()) {
            result = failed;
            return result;
        }
        if (password.matches(founduser.get(0).getPassword())) {

            System.out.println("user : " + founduser.get(0).getPassword() + " login successfully ");
            session.setAttribute("user", founduser.get(0));
            result = success;
        } else {
            System.out.println("login failed");
            result = failed;
        }

        return result;

    }

}
