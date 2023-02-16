package ru.marat.javacore.controllers;

import org.springframework.web.client.RestTemplate;
import ru.marat.javacore.interfaces.IPrintMessage;

public class RequestResponse {
    private int number;
    private final int max = 10000;

    public String getRequest() {
        double r = Math.random() * max;
        number = (int)r;
        RestTemplate restTemplate = new RestTemplate();
        String stringPosts = restTemplate.getForObject("http://numbersapi.com/" + number +"/trivia", String.class);
        return stringPosts;
    }
}
