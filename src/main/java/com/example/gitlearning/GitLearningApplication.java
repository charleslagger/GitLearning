package com.example.gitlearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitLearningApplication {

    public static void main(String[] args) {
        System.out.println("Commit main");
        SpringApplication.run(GitLearningApplication.class, args);
    }

}
