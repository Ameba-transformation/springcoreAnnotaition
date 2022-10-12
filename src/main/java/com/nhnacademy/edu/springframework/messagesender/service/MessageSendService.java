package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;
import com.nhnacademy.edu.springframework.messagesender.annotaition.SMS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class MessageSendService {

    private MessageSender messageSender;
    private String name;

    public MessageSendService(){

    }

    public void setSms(MessageSender messageSender) {
        System.out.println("setMessageSend!!!!");
        this.messageSender = messageSender;
    }

    @Autowired
    public MessageSendService(@SMS MessageSender messageSender,
                              @Value("${from}") String name) {
        this.messageSender = messageSender;
        this.name = name;
    }

    public void doSendMessage(){
        System.out.println("from : " + name);
        messageSender.sendMessage(new User("abcde", "010-1234-5678"),"hello");
    }
}
