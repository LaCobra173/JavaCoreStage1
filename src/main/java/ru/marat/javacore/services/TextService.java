package ru.marat.javacore.services;

import ru.marat.javacore.interfaces.TextProvider;
import ru.marat.javacore.old.controllers.PrintServiceImpl;
import ru.marat.javacore.utils.Logger;
import ru.marat.javacore.utils.TextUtils;

import java.util.Map;
import java.util.TreeMap;

public class TextService {
    private Logger logger;
    public void start(TextProvider textProvider) {
        String message = textProvider.provide();

        logger.print("%s \n", message);

        TextUtils textUtils = new TextUtils();
        TreeMap<Character, Integer> map = textUtils.gettingMap(message);
        logger.print("Частоты: ");
        String frequency = countingSymbols(map);
        logger.print("%s", frequency);
    }
    private String countingSymbols(TreeMap<Character, Integer> map) {
        int countSymbols = 0;
        int symbolsFrequency = 0;
        String charactersFrequency = "";

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();

            countSymbols += 1;
            symbolsFrequency += value;
            String count = (value >= 2 && value < 5) ? value + " раза" : value + " раз";
            charactersFrequency += key + " - " + count + "\n";
        }
        return charactersFrequency;
    }
}
