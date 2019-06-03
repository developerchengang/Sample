package com.doumiao.di.example.injector;

import com.doumiao.di.example.Application;
import com.doumiao.di.example.service.MessageServiceImpl;

public class EmailServiceInjector implements MessageServiceInjector {

    @Override
    public Consumer getConsumer() {
        Application app = new Application();
        app.setService(new MessageServiceImpl());
        return app;
    }

}
