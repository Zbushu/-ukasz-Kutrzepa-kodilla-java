package com.kodilla.spring.Forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    private String userName;

    public ForumUser() {
        this.userName = "John Smiths";
    }

    public String getUserName() {
        return userName;
    }
}
