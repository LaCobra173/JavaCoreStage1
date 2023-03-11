package ru.marat.javacore.controllers;

import org.springframework.web.client.RestTemplate;
import ru.marat.javacore.interfaces.TextProvider;

public class TextProviderImpl implements TextProvider {
    final int MAX = 10000;
    @Override
    public String provide() {
        int number = 0;
        double randomNumber = Math.random() * MAX;
        number = (int)randomNumber;
        RestTemplate restTemplate = new RestTemplate();
        String message = restTemplate.getForObject("http://numbersapi.com/" + number +"/trivia", String.class);
        return message;
    }
}
