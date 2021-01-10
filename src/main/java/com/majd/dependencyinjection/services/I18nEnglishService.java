package com.majd.dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN","default"})
@Service("i18nService")
public class I18nEnglishService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Friends - English service";
    }
}