/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package test.fptblog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import test.fptblog.model.postModel;

/**
 *
 * @author Dell
 */
public interface postRepository extends JpaRepository<postModel, Integer>{
//    extends JpaRepository<postModel, Integer>
}
