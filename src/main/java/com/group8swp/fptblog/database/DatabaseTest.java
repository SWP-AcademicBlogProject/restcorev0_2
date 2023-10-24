/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group8swp.fptblog.database;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.group8swp.fptblog.model.CategoryDTO;
import com.group8swp.fptblog.model.CommentDTO;
import com.group8swp.fptblog.model.PostDTO;
import com.group8swp.fptblog.model.SubjectDTO;
import com.group8swp.fptblog.model.TagDTO;
import com.group8swp.fptblog.model.UserDTO;

import com.group8swp.fptblog.repositories.CategoryRepository;
import com.group8swp.fptblog.repositories.CommentRepository;
import com.group8swp.fptblog.repositories.PostRepository;
import com.group8swp.fptblog.repositories.SubjectRepository;
import com.group8swp.fptblog.repositories.TagRepository;
import com.group8swp.fptblog.repositories.UserRepository;

/**
 *
 * @author pc
 */
@Configuration
public class DatabaseTest {

    private static final Logger logger = LoggerFactory.getLogger(DatabaseTest.class);

    
    @Bean
    CommandLineRunner initDatabase(UserRepository userrep, SubjectRepository subjectrep, 
            TagRepository tagrep, CommentRepository commentrep,CategoryRepository categoryrep,PostRepository postrep) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                //  userModel a = new userModel("khai","123","user");
                // userModel b = new userModel("admin","1","admin");
                // logger.info("insert data: " + userrep.save(a));
                // logger.info("insert data: " + userrep.save(b));
                UserDTO adminUser = new UserDTO("SE000000", "Admin", "1", "admin", "9-9-9999", 0, 0, 0, "admin account", "", null);
                List<UserDTO> userList = userrep.findAll();
                if (userList.size() == 0) {
                    logger.info("insert data: " + userrep.save(adminUser));
                    
                    
                    
                    
                    CategoryDTO category = new CategoryDTO(1,"AI","AI related",1);
                    List<CategoryDTO> cateList = categoryrep.findAll();
                 if (cateList.size()==0){
                     logger.info("insert data: " + categoryrep.save(category));
                 }
                 
                 
                 PostDTO post = new PostDTO(2,1,1,1,"1","ddd","SE150618","ưefwefaf","fwfe",1,1,1,"2023-9-17 10:09:08.000","01");
                 List<PostDTO> postList = postrep.findAll();
                 if (postList.size()==0) {
                     logger.info("insert data" + postrep.save(post));
                 }
                   
                 
                 CommentDTO comment = new CommentDTO("1","SE171011","Truong la so mot","2023-10-18 18:15:01.000",1,0);
                 List<CommentDTO> commentList = commentrep.findAll();
                 if (commentList.size()==0) {
                     logger.info("insert data" + commentrep.save(comment));
                 }
                 
                 
                 
                 
                }         

//           postRepository postrep     
//                PostDTO ab = new PostDTO(2,i,g,f,null,"fsfweew",null,"ưefwefaf","fwfe",1,1,1,"2023-10-22 23:07:01.000","02");
              //  PostDTO b = new PostDTO(2,1,1,1,"1","ddd","Duc","ưefwefaf","fwfe",1,1,1,"2023-9-17 10:09:08.000","01");
////                
//                logger.info("insert data: " + postrep.save(ab));
            //    logger.info("insert data: " + postrep.save(b));


// run thanh cong
//                SubjectDTO a = new SubjectDTO(2,"SE","Software Engineer",1);
//                SubjectDTO b = new SubjectDTO(3,"AI","Artificial intelligence",1);
//
//                logger.info("insert data: " + subjectrep.save(a));
//                logger.info("insert data: " + subjectrep.save(b));

// run thanh cong
//                TagDTO a = new TagDTO(2,"Event","Hoat dong clb, nha truong",1);
//                TagDTO b = new TagDTO(3,"Question","Giai dap thac mac",1);
//
//                logger.info("insert data: " + tagrep.save(a));
//                logger.info("insert data: " + tagrep.save(b));

// run thanh cong
//                CommentDTO a = new CommentDTO("2","SE171011","Truong la so mot","2023-10-18 18:15:01.000",1,0);
//                CommentDTO b = new CommentDTO("3","SE161131","Dao nay event truong hay that","2023-10-23 21:10:23.000",1,0);
//                logger.info("insert data: " + commentrep.save(a));
//                logger.info("insert data: " + commentrep.save(b));

// run thanh cong
//                CategoryDTO a = new CategoryDTO(2,"AI","AI related",1);
//                CategoryDTO b = new CategoryDTO(3,"MKT","MKT related",1);
//
//                logger.info("insert data: " + categoryrep.save(a));
//                logger.info("insert data: " + categoryrep.save(b));


//  =>database: [ subject, tag, comment, category ] connect successfully!!!
            }
        };
    }
}
