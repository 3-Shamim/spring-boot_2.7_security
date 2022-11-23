package com.learningstuff.springboot_2_7_security;

import com.learningstuff.springboot_2_7_security.models.User;
import com.learningstuff.springboot_2_7_security.repositories.UserRepository;
import com.learningstuff.springboot_2_7_security.utils.SecurityUtil;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner runner(UserRepository userRepository) {
        return args -> {

            User user = new User();
            user.setUsername("shamim");
            user.setPassword(SecurityUtil.encode("shamim"));

            User admin = new User();
            admin.setUsername("admin");
            admin.setPassword(SecurityUtil.encode("admin"));

            userRepository.saveAll(Arrays.asList(user, admin));

        };
    }

}
