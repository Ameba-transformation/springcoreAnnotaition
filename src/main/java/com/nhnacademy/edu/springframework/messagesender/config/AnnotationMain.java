package com.nhnacademy.edu.springframework.messagesender.config;

import com.nhnacademy.edu.springframework.messagesender.User;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSendService;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.SmsMessageSender;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationMain {
    public static void main(String[] args) {
        String basepackages = "com.nhnacademy.edu.springframework.messagesender";


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(basepackages);
//        context.getBean("sms", MessageSender.class).sendMessage(new User("qwe@qwe", "010"), "hi");

        MessageSendService service = context.getBean(MessageSendService.class);
        service.doSendMessage();
    }
}
