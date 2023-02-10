package ru.marat.javacore;

import ru.marat.javacore.controllers.GetRandomMessageController;

public class Application {
    public static void main(String[] args) {
        GetRandomMessageController messageController = new GetRandomMessageController();
        String message = messageController.getMessage();
        System.out.println(message + "\n");
        messageController.symbolCounts(message);
        messageController.FrequencySymbols();
    }
}
