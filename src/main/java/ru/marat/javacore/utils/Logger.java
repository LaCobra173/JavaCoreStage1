package ru.marat.javacore.utils;

import java.util.Formatter;

public class Logger {
    public static void print(String format, Object... obj){
        var message = new Formatter().format(format, obj).toString();
        System.out.println(message);
    }
}
