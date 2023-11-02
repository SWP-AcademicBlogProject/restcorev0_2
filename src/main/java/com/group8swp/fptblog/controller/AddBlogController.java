/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group8swp.fptblog.controller;

import com.group8swp.fptblog.model.CommentDTO;
import com.group8swp.fptblog.model.PostDTO;
import com.group8swp.fptblog.model.UserDTO;
import com.group8swp.fptblog.repositories.PostRepository;
import com.group8swp.fptblog.repositories.UserRepository;
import java.util.Collections;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author pc
 */

@Controller
public class AddBlogController {
    
@Autowired
private PostRepository postRep;
@Autowired
private UserRepository userRep;
    
    
    // nguoi dung nhap tieu de
    // nguoi dung nhap noi dung blog
    // -> nguoi dung bam submit -> traz ve parameter : 
    //              1. Author -> get session user name -> find user by name -> tra ve object user
    //                        -> new blog -> add para tieu de + noi dung + object user -> luu vao database
    
    
    @RequestMapping(value = "/AddNewBlog")
    public String addBlog(HttpSession session,Model model, 
            @RequestParam(value = "NewTitle") String newTitle,
            @RequestParam(value = "NewContent") String newContent) {
        
        
        
       UserDTO user = (UserDTO) session.getAttribute("user");
       
       
        PostDTO newPost = new PostDTO();
        newPost.setAuthor(user.getUserName());
        newPost.setTitle(newTitle);
        newPost.setPostContent(newContent);
        
//        user.getPostModel().add(newPost);
//        userRep.save(user);
        postRep.save(newPost);

        return "redirect:/viewforum";
    }
    
    @RequestMapping(value = "/viewforum")
    public String viewforum(HttpSession session, Model model)
    {
        UserDTO user = (UserDTO) session.getAttribute("user");
        List<PostDTO> post =postRep.findAll();
        Collections.reverse(post);
        model.addAttribute("post",post);
        return "viewforum";
    }
}
