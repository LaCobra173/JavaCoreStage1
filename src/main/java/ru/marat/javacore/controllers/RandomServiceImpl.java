package ru.marat.javacore.controllers;

import ru.marat.javacore.interfaces.RandomService;
public class RandomServiceImpl implements RandomService {
    private final int MAX = 10000;
    @Override
    public int randomNumber() {
        int number = 0;
        double randomNumber = Math.random() * MAX;
        number = (int)randomNumber;
        return number;
    }
}
