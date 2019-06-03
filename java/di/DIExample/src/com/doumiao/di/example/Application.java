package com.doumiao.di.example;

import com.doumiao.di.example.injector.Consumer;
import com.doumiao.di.example.service.MessageService;

public class Application implements Consumer {

    private MessageService service;

    public void setService(MessageService service) {
        this.service = service;
    }

    @Override
    public void processMessages(String rec, String msg) {
        service.sendMessage(rec, msg);
    }
}
