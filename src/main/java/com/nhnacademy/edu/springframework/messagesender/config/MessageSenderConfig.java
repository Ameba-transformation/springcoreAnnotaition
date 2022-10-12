package com.nhnacademy.edu.springframework.messagesender.config;

import com.nhnacademy.edu.springframework.messagesender.service.MessageSendService;
import com.nhnacademy.edu.springframework.messagesender.service.SmsMessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageSenderConfig {
    @Autowired
    private MainConfig mainConfig;

    @Bean
    public MessageSendService messageSendService(){
        return new MessageSendService(mainConfig.EmailMessageSender(), "hello");
    }

}
