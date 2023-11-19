/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group8swp.fptblog.controller;

import com.group8swp.fptblog.model.PostDTO;
import com.group8swp.fptblog.model.UserDTO;
import com.group8swp.fptblog.repositories.PostRepository;
import com.group8swp.fptblog.repositories.UserRepository;
import java.util.Collections;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Dell
 */
@Controller
public class LecturerController {

    @Autowired
    private UserRepository repository;

    @Autowired
    private PostRepository postRep;

    @RequestMapping(value = "/approval")
    public String Approval(HttpSession session, Model model) {
        UserDTO user = (UserDTO) session.getAttribute("user");
        List<PostDTO> post = postRep.findAll();
        Collections.reverse(post);
        model.addAttribute("post", post);
        model.addAttribute("user", user);
        return "aprovalblog";
    }
}
