package ru.marat.javacore.controllers;

import ru.marat.javacore.interfaces.IPrintMessage;
import ru.marat.javacore.interfaces.IPrintSymbols;

import java.util.Map;
import java.util.TreeMap;

public class CharacterСount implements IPrintMessage, IPrintSymbols {
    private static double symbolCount;
    private static double frequencySymbols;
    private static Map<Character, Integer> map = new TreeMap<>();

    public void symbolCounts(String str) {
        char[] charsMass = str.toCharArray();
        print();

        for (int i = 0; i < charsMass.length; i++) {
            map.computeIfPresent(charsMass[i], (key, value) -> value + 1);
            map.putIfAbsent(charsMass[i], 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();

            symbolCount += 1;
            frequencySymbols += value;
            String count = (value >= 2 && value < 5) ? value + " раза" : value + " раз";
            printSymbols(key, count);
        }
    }
    public static double getSymbolCount() {
        return symbolCount;
    }
    public static double getFrequencySymbols() {
        return frequencySymbols;
    }
    public static Map<Character, Integer> getMap() {
        return map;
    }
    @Override
    public void print() {
        System.out.println("Частоты: \b");
    }
    @Override
    public void printSymbols(char key, String value) {
        System.out.println(key + " - " + value);
    }
}