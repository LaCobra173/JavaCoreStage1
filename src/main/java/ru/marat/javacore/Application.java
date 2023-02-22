package ru.marat.javacore;

import ru.marat.javacore.controllers.TextServiceImpl;

public class Application {
    public static void main(String[] args) {
        TextServiceImpl textServiceImpl = new TextServiceImpl();
        textServiceImpl.start();
    }
}
