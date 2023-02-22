package ru.marat.javacore.controllers;

import ru.marat.javacore.interfaces.PrintService;
public class PrintServiceImpl implements PrintService {
    @Override
    public void printSymbols(char key, String value) {
        System.out.println(key + " - " + value);
    }
    @Override
    public void printText() {
        System.out.println("Частоты: \b");
    }
    @Override
    public void printFrequentSymbols(String symbols) {
        System.out.println("Символы, которые соответствуют условию " +
                "наиболее близкого значения частоты к среднему значению: " + symbols.substring(0, symbols.length() - 2) + ".");
    }
    @Override
    public void printFrequency(int frequencySymbols, int symbolCount, double avgFrequency) {
        System.out.println("\nСреднее значение частоты " + frequencySymbols +
                "/" + symbolCount + " = " + avgFrequency);
    }
    @Override
    public void printMessage(String message) {
        System.out.println(message + "\n");
    }
}
