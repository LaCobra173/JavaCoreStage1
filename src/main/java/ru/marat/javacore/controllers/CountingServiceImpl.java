package ru.marat.javacore.controllers;

import ru.marat.javacore.interfaces.CountingService;

import java.util.Map;
import java.util.TreeMap;

public class CountingServiceImpl implements CountingService {
    private int symbolCount;
    private int frequencySymbols;
    @Override
    public void countingSymbols(TreeMap<Character, Integer> map) {
        int countSymbols = 0;
        int symbolsFrequency = 0;
        PrintServiceImpl printServiceImpl = new PrintServiceImpl();

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();

            countSymbols += 1;
            symbolsFrequency += value;
            String count = (value >= 2 && value < 5) ? value + " раза" : value + " раз";
            printServiceImpl.printSymbols(key, count);
        }

        setSymbolCount(countSymbols);
        setFrequencySymbols(symbolsFrequency);
    }
    @Override
    public double countingAVGFrequency(double frequencySymbols, double symbolCount) {
        double avgFrequency = frequencySymbols / symbolCount;
        return avgFrequency;
    }
    public int getSymbolCount() {
        return symbolCount;
    }
    public void setSymbolCount(int symbolCount) {
        this.symbolCount = symbolCount;
    }
    public int getFrequencySymbols() {
        return frequencySymbols;
    }
    public void setFrequencySymbols(int frequencySymbols) {
        this.frequencySymbols = frequencySymbols;
    }
}
