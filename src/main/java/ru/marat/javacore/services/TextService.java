package ru.marat.javacore.services;

import ru.marat.javacore.services.textprovider.TextProvider;
import ru.marat.javacore.utils.Logger;
import ru.marat.javacore.utils.TextUtils;

import java.util.*;

public class TextService {
    private final TextProvider textProvider;
    public TextService(TextProvider textProvider) {
        this.textProvider = textProvider;
    }
    public void start() {
        String message = textProvider.provide();

        Logger.print("%s \n", message);

        TreeMap<Character, Integer> map = TextUtils.gettingMap(message);
        Logger.print("Частоты: ");

        TreeMap<Character, String> frequency = countingSymbols(map);
        frequency.forEach((key, value) -> Logger.print("%s - %s", key, value));
    }
    private TreeMap<Character, String> countingSymbols(TreeMap<Character, Integer> map) {
        TreeMap<Character, String> charactersMap = new TreeMap<>();

        map.entrySet().stream().forEach(entry -> {
            int value = entry.getValue();
            String count = (value >= 2 && value < 5) ? value + " раза" : value + " раз";
            charactersMap.put(entry.getKey(), count);
        });

        return charactersMap;
    }
}
