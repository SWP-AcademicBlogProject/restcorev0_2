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
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
        
        @PostMapping("/add")
        ResponseEntity<responseObj> insertUser(@RequestBody userModel newUser) {
            List<userModel> foundUser = repository.findByUsername(newUser.getUsername().trim());
            if (foundUser.size() > 0) {
                 return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(
            new responseObj("failed", "user already registetred !!!", "")
            );
            }
            return ResponseEntity.status(HttpStatus.OK).body(
            new responseObj("ok", "Insert user successfully", repository.save(newUser))
            );
            
        }
        
        @PutMapping("/{id}")
         ResponseEntity<responseObj> updateUser(@RequestBody userModel newUser, @PathVariable Long id) {
             userModel updateUser = repository.findById(id).map(user -> {
                 user.setUsername(newUser.getUsername());
                 user.setPassword(user.getPassword());
                 user.setRoleid(newUser.getRoleid());
                 return repository.save(user);
             }).orElseGet(()-> {
                 newUser.setId(id);
                 return repository.save(newUser);
             });
        return ResponseEntity.status(HttpStatus.OK).body(
                new responseObj("ok","update successfully", updateUser));
         }
         
         
         @DeleteMapping("/{id}")
         ResponseEntity<responseObj> deleteUser(@PathVariable Long id){
             boolean exist = repository.existsById(id);
             if (exist) {
                 repository.deleteById(id);
                  return ResponseEntity.status(HttpStatus.OK).body(
                new responseObj("ok","delete successfully", ""));
             }
             
              return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                new responseObj("failed","delete failed", ""));
         }
         
    
}
