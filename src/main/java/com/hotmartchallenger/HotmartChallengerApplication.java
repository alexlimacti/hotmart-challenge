package com.hotmartchallenger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class HotmartChallengerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HotmartChallengerApplication.class, args);
    }

}
