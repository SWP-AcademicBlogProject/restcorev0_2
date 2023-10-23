/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package test.fptblog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import test.fptblog.model.categoryModel;

/**
 *
 * @author Dell
 */
public interface categoryRepository extends JpaRepository<categoryModel, Integer>{
    
}
