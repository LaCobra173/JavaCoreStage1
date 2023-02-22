package ru.marat.javacore.controllers;

import ru.marat.javacore.interfaces.CreatingMapService;

import java.util.TreeMap;
public class CreatingMapServiceImpl implements CreatingMapService {
    @Override
    public TreeMap countingSymbols(String message) {
        TreeMap<Character, Integer> map = new TreeMap();
        char[] massChars = message.toCharArray();

        for(Character character : massChars){
            map.computeIfPresent(character, (key, value) -> value + 1);
            map.putIfAbsent(character, 1);
        }

        return map;
    }
}