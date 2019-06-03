package com.doumiao.di.example;

import com.doumiao.di.example.injector.Consumer;
import com.doumiao.di.example.injector.EmailServiceInjector;
import com.doumiao.di.example.injector.MessageServiceInjector;
import com.doumiao.di.example.injector.SMSServiceInjector;

public class Main {

    public static void main(String[] args) {

        /**
         * 在Java中使用依赖注入的一些好处:
         * 1. 关注点分离
         * 2. 减少应用程序类中的样本代码，因为初始化依赖项的所有工作都由注入器组件处理
         * 3. 可配置组件使应用程序易于扩展
         * 4. 可以轻松使用模拟对象进行单元测试
         *
         * Java依赖注入也有一些缺点：
         * 1. 如果过度使用，则可能导致维护问题，因为更改的影响在运行时才能被发现
         * 2. java中的依赖注入隐藏了可能在编译时引发的错误
         */
        String email = "chendoumiao@gmail.com";
        String msg = "Hi chen gang";
        String phone = "185-6620-8286";

        MessageServiceInjector injector;
        Consumer app;

        injector = new EmailServiceInjector();
        app = injector.getConsumer();
        app.processMessages(email, msg);

        injector = new SMSServiceInjector();
        app = injector.getConsumer();
        app.processMessages(phone, msg);

    }
}
