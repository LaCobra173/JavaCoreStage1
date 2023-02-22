package ru.marat.javacore.interfaces;

public interface PrintService {
    void printSymbols(char key, String value);
    void printText();
    void printFrequentSymbols(String symbols);
    void printFrequency(int frequencySymbols, int symbolCount, double avgFrequency);
    void printMessage(String message);
}
