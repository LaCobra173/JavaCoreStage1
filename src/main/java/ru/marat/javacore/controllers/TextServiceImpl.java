package ru.marat.javacore.controllers;

import java.util.TreeMap;
public class TextServiceImpl {
    public void start(){
        RandomServiceImpl random = new RandomServiceImpl();
        NumbersAPIImpl request = new NumbersAPIImpl();
        PrintServiceImpl consolePrint = new PrintServiceImpl();
        CreatingMapServiceImpl creatingMap = new CreatingMapServiceImpl();
        CountingServiceImpl countingServiceImpl = new CountingServiceImpl();

        int number = random.randomNumber(); // Получаем рандомное число от 1 до 9999
        String message = request.getResponse(number); // Получаем ответ из запроса
        consolePrint.printMessage(message); // Печатаем в консоль ответ на запрос

        consolePrint.printText();
        TreeMap<Character, Integer> map =  creatingMap.countingSymbols(message); // Получение словаря
        countingServiceImpl.countingSymbols(map); // Подсчет количества символов

        // Задание со *
        double symbolCount = countingServiceImpl.getSymbolCount(); // Кол-во символов
        double frequencySymbols = countingServiceImpl.getFrequencySymbols(); // Количество частоты символов
        double avgFrequency = countingServiceImpl.countingAVGFrequency(frequencySymbols, symbolCount);
        consolePrint.printFrequency((int)frequencySymbols, (int)symbolCount, avgFrequency); // Печатаем в консоль среднее значение частоты

        FindingSymbolServiceImpl findingSymbolServiceImpl = new FindingSymbolServiceImpl();
        String symbols = findingSymbolServiceImpl.findingSymbol(map, avgFrequency); // Получение строки с отобранными символами
        consolePrint.printFrequentSymbols(symbols); // Печатаем в консоль символы, близкие по значению частоты к среднему значению
    }
}
