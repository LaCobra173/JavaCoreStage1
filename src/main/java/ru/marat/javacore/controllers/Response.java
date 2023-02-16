package ru.marat.javacore.controllers;

import ru.marat.javacore.interfaces.IPrintMessage;

public class Response implements IPrintMessage {
    private String msg;
    public void printResponse() {
        RequestResponse requestResponse = new RequestResponse();
        setMsg(requestResponse.getRequest());
        print();
    }
    @Override
    public void print() {
        System.out.println(msg + "\n");
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
}
