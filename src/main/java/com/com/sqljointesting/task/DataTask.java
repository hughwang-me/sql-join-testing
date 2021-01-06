package com.com.sqljointesting.task;

import com.com.sqljointesting.service.FamilyInfoService;
import com.com.sqljointesting.service.PostInfoService;
import com.com.sqljointesting.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DataTask {

    @Autowired
    UserService userService;
    @Autowired
    PostInfoService postInfoService;
    @Autowired
    FamilyInfoService familyInfoService;

    @Scheduled(initialDelay = 1000 * 2 , fixedRate = 1000*60 * 60)
    public void run(){
        log.warn("开始模拟用户数据");
//        userService.insert();
//        postInfoService.insert();
//        familyInfoService.insert();
    }
}
