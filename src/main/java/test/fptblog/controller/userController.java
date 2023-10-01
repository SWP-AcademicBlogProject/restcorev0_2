/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.fptblog.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.fptblog.model.responseObj;
import test.fptblog.model.userModel;
import test.fptblog.repositories.userRepository;

/**
 *
 * @author pc
 */

@RestController
@RequestMapping(path = "/api/userlist")
public class userController {
    @Autowired
    private userRepository repository;
    
    
    @GetMapping("")
    List<userModel> getAll() {
        return repository.findAll();
    }
    
    @GetMapping("/{id}")
    //userModel
        ResponseEntity<responseObj> findbyid(@PathVariable long id) {
            Optional<userModel> founduser = repository.findById(id);
            if(founduser.isPresent()){
                return ResponseEntity.status(HttpStatus.OK).body(
                        new responseObj("ok","query product successfully",founduser)); 
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                        new responseObj("no","cannot found user: ",founduser)); 
            }
        
    }   
    
}
