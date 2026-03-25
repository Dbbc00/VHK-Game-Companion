package com.vhk.gamecompanion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * VHK游戏陪玩小程序后端服务主启动类
 * 
 * @author VKHbug团队
 * @version 1.0.0
 * @since 2024-01-01
 */
@SpringBootApplication
@EnableCaching
@EnableMongoAuditing
@EnableMongoRepositories(basePackages = "com.vhk.gamecompanion.repository")
@EnableScheduling
public class VhkApplication {

    public static void main(String[] args) {
        SpringApplication.run(VhkApplication.class, args);
        System.out.println("======================================");
        System.out.println("   VHK游戏陪玩小程序后端服务启动成功！   ");
        System.out.println("   API文档地址: http://localhost:8080/api/swagger-ui.html");
        System.out.println("   VKHbug团队 - https://vkhbug-team.vercel.app");
        System.out.println("======================================");
    }

}