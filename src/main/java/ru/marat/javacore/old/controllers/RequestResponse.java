package ru.marat.javacore.old.controllers;

import org.springframework.web.client.RestTemplate;

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
