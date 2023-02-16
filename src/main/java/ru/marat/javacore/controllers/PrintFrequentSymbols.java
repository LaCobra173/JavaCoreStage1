package ru.marat.javacore.controllers;

import ru.marat.javacore.interfaces.IPrintFrequentSymbols;

import java.util.Map;
import java.util.TreeMap;

public class PrintFrequentSymbols extends Frequency implements IPrintFrequentSymbols {
    private String str = "";
    private Map<Character, Integer> map = new TreeMap<>();

    public void FrequencySymbols() {
        int number = (int)Math.round(getAvgFrequency());
        map  = getMap();

        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == number){
                str += entry.getKey() + "(" + entry.getKey().hashCode() + "), ";
            }
        }
        printFrequentSymbols(str);
    }
    @Override
    public void printFrequentSymbols(String symbols) {
        System.out.println("Символы, которые соответствуют условию " +
                "наиболее близкого значения частоты к среднему значению: " + symbols.substring(0, symbols.length()-2) + ".");
    }
}