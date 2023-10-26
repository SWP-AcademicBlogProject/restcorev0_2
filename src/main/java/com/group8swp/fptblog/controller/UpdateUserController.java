/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group8swp.fptblog.controller;

import com.group8swp.fptblog.model.UserDTO;
import com.group8swp.fptblog.repositories.UserRepository;
import java.util.List;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import static org.hibernate.criterion.Projections.id;
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
public class UpdateUserController {
    @Autowired
    private UserRepository repository;

//<---------------------------update profile function----------------------------->    
//        @RequestMapping(value = "/viewprofilee", method = RequestMethod.POST)
//    public String updateuser(HttpSession session,
//            @RequestParam(value = "userid") String userid, Model model) {
//        
//        UserDTO newUser =new UserDTO();
//
//         UserDTO updateUser = repository.findById(userid).map(user -> {
//            user.setUserName(newUser.getUserName());
//            user.setPassword(user.getPassword());
//            user.setBirthdate(user.getBirthdate());
//            user.setDescription(user.getDescription());
//            return repository.save(user);
//        }).orElseGet(() -> {
//            newUser.setUserID(userid);
//            return repository.save(newUser);
//        });
//         
//            Optional<UserDTO> user=repository.findById(userid);
//            session.setAttribute("user", user);
//        return "redirect:/viewprofile";
//    }
//?userid=value    
//        @RequestMapping(value = "/viewprofilee", method = RequestMethod.GET)
//        public String upuser(HttpSession session,
//                @RequestParam(value = "userid") String userid,Model model){
//            Optional<UserDTO> user=repository.findById(userid);
//            if(user.isPresent()){
//                UserDTO core= user.get();
//                model.addAttribute("user",core);
//            }
//            
//            return "profile";
//        }
        
        
        
        
        
        
//<----------------------------view profile function----------------------------->            
    @RequestMapping(value="/viewprofile")
    public String viewProfile(HttpServletRequest request, Model model) {
        HttpSession session = request.getSession();
        UserDTO user = (UserDTO) session.getAttribute("user");
        model.addAttribute("user", user);
        return "profile";
    }
}
