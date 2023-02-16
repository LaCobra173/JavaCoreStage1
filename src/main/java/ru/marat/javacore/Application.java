package ru.marat.javacore;

import ru.marat.javacore.controllers.GetMessagesAndValueCapture;

public class Application {
    public static void main(String[] args) {
        GetMessagesAndValueCapture getMessagesAndValueCapture = new GetMessagesAndValueCapture();
        getMessagesAndValueCapture.start();
    }
}
