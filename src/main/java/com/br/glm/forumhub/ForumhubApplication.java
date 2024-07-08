package com.br.glm.forumhub;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.br.glm.forumhub.repository")
public class ForumhubApplication {
    public static void main(String[] args) {
        SpringApplication.run(ForumhubApplication.class, args);
    }
}
