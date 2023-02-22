package ru.marat.javacore.old.controllers;

import ru.marat.javacore.old.interfaces.IPrintFrequency;

public class Frequency extends CharacterСount implements IPrintFrequency {
    private static double avgFrequency;

    public void FrequencySymbols() {
        double frequencySymbols = getFrequencySymbols();
        double symbolCount = getSymbolCount();

        avgFrequency = frequencySymbols / symbolCount;
        printFrequency((int)frequencySymbols, (int)symbolCount, avgFrequency);
    }
    public double getAvgFrequency() {
        return avgFrequency;
    }
    @Override
    public void printFrequency(int frequencySymbols, int symbolCount, double avgFrequency) {
        System.out.println("\nСреднее значение частоты " + frequencySymbols +
                "/" + symbolCount + " = " + avgFrequency);
    }
}