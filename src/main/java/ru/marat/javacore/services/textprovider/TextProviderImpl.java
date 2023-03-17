package ru.marat.javacore.services.textprovider;

import org.springframework.web.client.RestTemplate;

public class TextProviderImpl implements TextProvider {
    final int MAX = 10000;
    @Override
    public String provide() {
        int number = gettingRandomNumber();
        RestTemplate restTemplate = new RestTemplate();
        String message = restTemplate.getForObject("http://numbersapi.com/" + number +"/trivia", String.class);
        return message;
    }
    private int gettingRandomNumber() {
        int number = 0;
        double randomNumber = Math.random() * MAX;
        number = (int)randomNumber;
        return number;
    }
}
