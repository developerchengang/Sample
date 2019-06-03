package com.doumiao.di.example.injector;

import com.doumiao.di.example.Application;
import com.doumiao.di.example.service.SMSServiceImpl;

public class SMSServiceInjector implements MessageServiceInjector {
    @Override
    public Consumer getConsumer() {
        Application app = new Application();
        app.setService(new SMSServiceImpl());
        return app;
    }
}
