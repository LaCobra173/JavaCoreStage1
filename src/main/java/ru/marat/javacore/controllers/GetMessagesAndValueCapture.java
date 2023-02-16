package ru.marat.javacore.controllers;

public class GetMessagesAndValueCapture {
    public void start() {
        Response response = new Response();
        CharacterСount characterСount = new CharacterСount();

        response.printResponse();
        characterСount.symbolCounts(response.getMsg());

        Frequency frequency = new Frequency();
        frequency.FrequencySymbols();

        PrintFrequentSymbols printFrequentSymbols = new PrintFrequentSymbols();
        printFrequentSymbols.FrequencySymbols();

    }
}