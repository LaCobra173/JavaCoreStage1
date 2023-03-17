package ru.marat.javacore;

import ru.marat.javacore.services.textprovider.TextProviderImpl;
import ru.marat.javacore.services.TextService;

public class Application {
    public static void main(String[] args) {
        TextService textService = new TextService(new TextProviderImpl());
        textService.start();
    }
}
