/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group8swp.fptblog.controller;

import com.group8swp.fptblog.model.UserDTO;
import com.group8swp.fptblog.repositories.CategoryRepository;
import com.group8swp.fptblog.repositories.SubjectRepository;
import com.group8swp.fptblog.repositories.TagRepository;
import com.group8swp.fptblog.repositories.UserRepository;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Dell
 */
@Controller
public class AdminController {

    @Autowired
    private UserRepository userRepository;
    private CategoryRepository categoryRepository;
    private TagRepository tagRepository;
    private SubjectRepository subjectRepository;

    @RequestMapping(value = "/loginadmin")
    public String loginadmin(HttpSession session,
            @RequestParam(value = "username") String username,
            @RequestParam(value = "password") String password) {

        String failed = "auth-login";
        String success = "landing_page";

        String admin = "admin";
        String result = null;

        List<UserDTO> founduser = userRepository.findByUserName(username);
        if (founduser.isEmpty()) {
            result = failed;
            return result;
        }
        if (password.matches(founduser.get(0).getPassword())
                && admin.equalsIgnoreCase(founduser.get(0).getUserName())) {

            System.out.println("admin : " + founduser.get(0).getUserName() + "password:" + founduser.get(0).getPassword() + " login successfully ");
            session.setAttribute("user", founduser.get(0));
            result = success;
        } else {
            System.out.println("login failed");
            result = failed;
        }

        return result;

    }

    @RequestMapping(value = "/loginadmin", method = RequestMethod.GET)
    public String loginPage() {
        return "auth-login";
    }
    
    

    @RequestMapping(value = "/landingpage")
    public String viewdashboard(HttpServletRequest request, Model model) {
        HttpSession session = request.getSession();
        UserDTO user = (UserDTO) session.getAttribute("user");
        model.addAttribute("user", user);
        return "landing_page";
    }

    @RequestMapping(value = "/landingprofile")
    public String viewadminprofile(HttpServletRequest request, Model model) {
        HttpSession session = request.getSession();
        UserDTO user = (UserDTO) session.getAttribute("user");
        model.addAttribute("user", user);
        return "landing_profile";
    }

    @RequestMapping(value = "/landingsystem")
    public String viewsystem(HttpServletRequest request, Model model) {
        HttpSession session = request.getSession();
        UserDTO user = (UserDTO) session.getAttribute("user");
        model.addAttribute("user", user);
        return "landing_system";
    }
}