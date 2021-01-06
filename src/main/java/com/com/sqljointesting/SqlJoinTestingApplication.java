package com.com.sqljointesting;

import com.com.sqljointesting.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SqlJoinTestingApplication {



    public static void main(String[] args) {
        SpringApplication.run(SqlJoinTestingApplication.class, args);

    }

}
