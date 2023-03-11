package ru.marat.javacore;

import ru.marat.javacore.interfaces.TextProvider;
import ru.marat.javacore.controllers.TextProviderImpl;
import ru.marat.javacore.services.TextService;

public class Application {
    public static void main(String[] args) {
        TextService textService = new TextService();
        textService.start(new TextProviderImpl());
    }
}
