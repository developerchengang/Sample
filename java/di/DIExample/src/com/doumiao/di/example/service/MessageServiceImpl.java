package com.doumiao.di.example.service;

public class MessageServiceImpl implements MessageService {

    @Override
    public void sendMessage(String rec, String message) {
        System.out.println("Email sent to " + rec + " with Message = " + message);
    }

}
