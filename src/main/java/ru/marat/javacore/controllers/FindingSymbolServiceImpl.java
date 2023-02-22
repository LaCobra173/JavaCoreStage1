package ru.marat.javacore.controllers;

import ru.marat.javacore.interfaces.FindingSymbolService;

import java.util.Map;
import java.util.TreeMap;
public class FindingSymbolServiceImpl implements FindingSymbolService {
    @Override
    public String findingSymbol(TreeMap<Character, Integer> map, double avgFrequency) {
        String symbols = "";
        int number = (int)Math.round(avgFrequency);

        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == number){
                symbols += entry.getKey() + "(" + entry.getKey().hashCode() + "), ";
            }
        }

        return symbols;
    }
}
