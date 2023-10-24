/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.fptblog.database;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import test.fptblog.model.categoryModel;
import test.fptblog.model.commentModel;
import test.fptblog.model.postModel;

import test.fptblog.model.subjectModel;
import test.fptblog.model.tagModel;
import test.fptblog.model.userModel;
import test.fptblog.repositories.categoryRepository;
import test.fptblog.repositories.commentRepository;
import test.fptblog.repositories.postRepository;

import test.fptblog.repositories.subjectRepository;
import test.fptblog.repositories.tagRepository;
import test.fptblog.repositories.userRepository;

/**
 *
 * @author pc
 */
@Configuration
public class database {

    private static final Logger logger = LoggerFactory.getLogger(database.class);

    
    @Bean
    CommandLineRunner initDatabase(userRepository userrep, subjectRepository subjectrep, 
            tagRepository tagrep, commentRepository commentrep,categoryRepository categoryrep,postRepository postrep) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                //  userModel a = new userModel("khai","123","user");
                // userModel b = new userModel("admin","1","admin");
                // logger.info("insert data: " + userrep.save(a));
                // logger.info("insert data: " + userrep.save(b));
                userModel adminUser = new userModel("SE000000", "Admin", "1", "admin", "9-9-9999", 0, 0, 0, "admin account", "", null);
                List<userModel> userList = userrep.findAll();
                if (userList.size() == 0) {
                    logger.info("insert data: " + userrep.save(adminUser));
                }         

//           postRepository postrep     
//                postModel ab = new postModel(2,i,g,f,null,"fsfweew",null,"ưefwefaf","fwfe",1,1,1,"2023-10-22 23:07:01.000","02");
              //  postModel b = new postModel(2,1,1,1,"1","ddd","Duc","ưefwefaf","fwfe",1,1,1,"2023-9-17 10:09:08.000","01");
////                
//                logger.info("insert data: " + postrep.save(ab));
            //    logger.info("insert data: " + postrep.save(b));


// run thanh cong
//                subjectModel a = new subjectModel(2,"SE","Software Engineer",1);
//                subjectModel b = new subjectModel(3,"AI","Artificial intelligence",1);
//
//                logger.info("insert data: " + subjectrep.save(a));
//                logger.info("insert data: " + subjectrep.save(b));

// run thanh cong
//                tagModel a = new tagModel(2,"Event","Hoat dong clb, nha truong",1);
//                tagModel b = new tagModel(3,"Question","Giai dap thac mac",1);
//
//                logger.info("insert data: " + tagrep.save(a));
//                logger.info("insert data: " + tagrep.save(b));

// run thanh cong
//                commentModel a = new commentModel("2","SE171011","Truong la so mot","2023-10-18 18:15:01.000",1,0);
//                commentModel b = new commentModel("3","SE161131","Dao nay event truong hay that","2023-10-23 21:10:23.000",1,0);
//                logger.info("insert data: " + commentrep.save(a));
//                logger.info("insert data: " + commentrep.save(b));

// run thanh cong
//                categoryModel a = new categoryModel(2,"AI","AI related",1);
//                categoryModel b = new categoryModel(3,"MKT","MKT related",1);
//
//                logger.info("insert data: " + categoryrep.save(a));
//                logger.info("insert data: " + categoryrep.save(b));


//  =>database: [ subject, tag, comment, category ] connect successfully!!!
            }
        };
    }
}
