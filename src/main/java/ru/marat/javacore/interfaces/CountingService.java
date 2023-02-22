package ru.marat.javacore.interfaces;

import java.util.TreeMap;
public interface CountingService {
    void countingSymbols(TreeMap<Character, Integer> map);
    double countingAVGFrequency(double frequencySymbols, double symbolCount);
}
