package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;

public class EmailMessageSender implements MessageSender {
    public EmailMessageSender(){
        System.out.println("email created");
    }

    public void destroy(){
        System.out.println("destroy method called in EmailMessageSender");
    }

    @Override
    public void sendMessage(User user, String message) {
        System.out.println("Email message " + user.getEmail() + ": " + message);
    }
}
