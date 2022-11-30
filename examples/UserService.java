package com.examples;

import org.springframework.stereotype.Component;

@Component

public class UserService {

    public static void main(String[] args){
    }
        NotificationService notificationService;


        public UserService(NotificationService notificationService){
            System.out.println("Hello World");
            this.notificationService = notificationService;
        }

}
