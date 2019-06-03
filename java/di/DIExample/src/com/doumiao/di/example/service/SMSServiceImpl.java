package com.doumiao.di.example.service;

public class SMSServiceImpl implements MessageService {
    @Override
    public void sendMessage(String rec, String message) {
        System.out.println("SMS sent to " + rec + " with Message = " + message);
    }
}
