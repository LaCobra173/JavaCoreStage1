package ru.marat.javacore.controllers;

import org.springframework.web.client.RestTemplate;
import ru.marat.javacore.interfaces.NumbersAPI;
public class NumbersAPIImpl implements NumbersAPI {
    @Override
    public String getResponse(int number) {
        RestTemplate restTemplate = new RestTemplate();
        String stringPosts = restTemplate.getForObject("http://numbersapi.com/" + number +"/trivia", String.class);
        return stringPosts;
    }
}
