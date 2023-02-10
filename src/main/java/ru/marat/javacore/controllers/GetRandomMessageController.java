package ru.marat.javacore.controllers;

import org.springframework.web.client.RestTemplate;
import java.util.*;

public class GetRandomMessageController {
    private int number;
    private final int max = 10000;
    private static double symbolCount;
    private static double frequencySymbols;
    private static Map<Character, Integer> map = new TreeMap<>();
    public GetRandomMessageController() {}
    public String getMessage() {
        double randomNumber = Math.random() * max;
        number = (int)randomNumber;
        RestTemplate restTemplate = new RestTemplate();
        String stringPosts = restTemplate.getForObject("http://numbersapi.com/" + number +"/trivia", String.class);
        return stringPosts;
    }
    public void symbolCounts(String str) {
        char[] charsMass = str.toCharArray();
        System.out.println("Частоты: \b");

        for (int i = 0; i < charsMass.length; i++) {
            map.computeIfPresent(charsMass[i], (key, value) -> value + 1);
            map.putIfAbsent(charsMass[i], 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char ch = entry.getKey();
            int value = entry.getValue();
            symbolCount += 1;
            frequencySymbols += value;
            String count = (value >= 2 && value < 5) ? value + " раза" : value + " раз";
            System.out.println(ch + " - " + count);
        }
    }
    public void FrequencySymbols() {
        double avgFrequency = frequencySymbols / symbolCount;
        int number = (int)Math.round(avgFrequency);
        System.out.println("\nСреднее значение частоты " + (int)frequencySymbols +
            "/" + (int)symbolCount + " = " + avgFrequency);

        String str = "";
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == number){
                str += entry.getKey() + "(" + entry.getKey().hashCode() + "), ";
            }
        }

        System.out.println("Символы, которые соответствуют условию " +
                "наиболее близкого значения частоты к среднему значению: " + str.substring(0, str.length()-2) + ".");
    }
}
