/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.fptblog.controller;

import java.util.List;
<<<<<<< HEAD
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import test.fptblog.model.loginForm;
import test.fptblog.model.logoutForm;
>>>>>>> 419baff8b80f949cfd0dc7a04d9a8d1f349d2574
import test.fptblog.model.userModel;
import test.fptblog.repositories.userRepository;

/**
 *
<<<<<<< HEAD
 * @author pc
 */
@Controller
public class loginController {
    
     @Autowired
    private userRepository repository;
    
    @RequestMapping(value = "/login")
    public String login(HttpSession session, @RequestParam(value = "username") String username,@RequestParam(value = "password") String password ) {
        
        
        
        
        List<userModel> founduser = repository.findByUserName(username);
        if (founduser.isEmpty()) return "loginfailed";
        if (password.matches(founduser.get(0).getPassword())) {
            
            System.out.println("user : " + founduser.get(0).getPassword() + " login successfully ");
            session.setAttribute("user", founduser.get(0).getUserName());
            return "viewforum";
        } else {
            System.out.println("login failed");
            return "loginfailed";
        }
        
        
        
        
        
    }
    
}
=======
 * @author Dell
 */
@Controller
public class loginController {
   

        @RequestMapping(value="/Background", method=RequestMethod.GET)
        public String Background(){
            return "index";
        }
    
        @RequestMapping(value="/login", method=RequestMethod.GET)
        public String getloginObj(){
            return "loginnnn";
        }
        
        @RequestMapping(value="/homepage", method=RequestMethod.GET)
        public String accesshomepage(){
            return "viewforum";
        }
        @RequestMapping(value="/profile_user", method=RequestMethod.GET)
    public String profileuser(){
        return "profile";
    }
    
    
        @RequestMapping(value="/login", method=RequestMethod.POST)
        public String login(@ModelAttribute(name="loginForm") loginForm loginForm, Model model){
        String  username= loginForm.getUsername();
        String password= loginForm.getPassword();
        System.out.println("UI:" + loginForm);       
//        if(username.matches("^[a-z0-9](\\.?[a-z0-9]){5,}@fpt\\.edu\\.vn$") || username.equals("minh")){
            return "viewforum";
//        }
//        model.addAttribute("invalidCredentials",true);
//        return "loginnnn";
//        ModelAndView modelAndView=new ModelAndView();
//        modelAndView.setViewName("viewforum");
//        modelAndView.addObject("loginO",loginObj);
//        return modelAndView;
    }
        
        
    @RequestMapping(value="/loginadmin", method=RequestMethod.GET)
    public String loginPage(){
        return "auth-login";
    }

    @RequestMapping(value="/system", method=RequestMethod.GET)
    public String system(){
        return "landing_system";
    }
    
    @RequestMapping(value="/profileAdmin", method=RequestMethod.GET)
    public String profileAdmin(){
        return "landing_profile";
    }
    
    @RequestMapping("/home")
    public String loginSubmit(){
        return "landing_page";
    }
    
           @RequestMapping(value="/loginadmin", method=RequestMethod.POST)
        public String loginadmin(@ModelAttribute(name="loginForm") loginForm loginForm, Model model){
        String  username= loginForm.getUsername();
        String  password= loginForm.getPassword();
        System.out.println("UI:" + loginForm);       
//        if("admin".equals(username)){
            return "landing_page";
//        }
//        model.addAttribute("invalidCredentials",true);
//        return "auth-login";
        
//        ModelAndView modelAndView=new ModelAndView();
//        modelAndView.setViewName("viewforum");
//        modelAndView.addObject("loginO",loginObj);
//        return modelAndView;
    }
        
    @RequestMapping(value="/register", method=RequestMethod.GET)
    public String RegisterPage(){
        return "create";
    }
    @RequestMapping(value="/register", method=RequestMethod.POST)
        public String Register(@ModelAttribute(name="logoutForm") logoutForm logoutForm, Model model){
        System.out.println("UI:" + logoutForm);       
//        if(username.matches("^[a-z0-9](\\.?[a-z0-9]){5,}@fpt\\.edu\\.vn$") || username.equals("minh")){
            return "loginnnn";
}
    @RequestMapping(value="/profileAdmin", method=RequestMethod.POST)
        public String updateProfile(@ModelAttribute(name="logoutForm") logoutForm logoutForm, Model model){
        System.out.println("UI:" + logoutForm);       
//        if(username.matches("^[a-z0-9](\\.?[a-z0-9]){5,}@fpt\\.edu\\.vn$") || username.equals("minh")){
            return "landing_profile";
}
        
}
>>>>>>> 419baff8b80f949cfd0dc7a04d9a8d1f349d2574
