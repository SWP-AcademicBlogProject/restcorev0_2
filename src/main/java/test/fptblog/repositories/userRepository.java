/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.fptblog.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import test.fptblog.model.userModel;

/**
 *
 * @author pc
 */
public interface userRepository extends JpaRepository<userModel, Long>{
    
    List<userModel> findByUsername(String userName);
    
}
