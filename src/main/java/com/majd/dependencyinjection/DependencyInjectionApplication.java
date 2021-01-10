package com.majd.dependencyinjection;

import com.majd.dependencyinjection.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);

        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println(i18nController.sayHello());

        MyController myController = (MyController) ctx.getBean("myController");
        System.out.println("------- Primary Bean");
        System.out.println(myController.sayHello());

        System.out.println("------- Property");

        PropertyInjectedController property = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

        System.out.println(property.getGreeting());

        System.out.println("------- Setter");
        SetterBasedController setterBasedController = (SetterBasedController) ctx.getBean("setterBasedController");

        System.out.println(setterBasedController.getGreeting());
        System.out.println("------- Constructor");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController)  ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());
    }

}
