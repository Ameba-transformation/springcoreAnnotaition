package com.nhnacademy.edu.springframework.messagesender.config;


import com.nhnacademy.edu.springframework.messagesender.service.EmailMessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.SmsMessageSender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
public class MainConfig {
    @Bean("sms")
    public MessageSender SmsMessageSender(){
        return new SmsMessageSender();
    }

    @Bean("email")
    public MessageSender EmailMessageSender(){
        return new EmailMessageSender();
    }
}
