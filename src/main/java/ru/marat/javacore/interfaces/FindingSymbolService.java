package ru.marat.javacore.interfaces;

import java.util.TreeMap;

public interface FindingSymbolService {
    String findingSymbol(TreeMap<Character, Integer> map, double avgFrequency);
}
