package by.epamtc.jwd.task1.run;

//todo Создать класс Hello, который будет приветствовать любого пользователя при вводе его имени
//todo через командную строку.

import by.epamtc.jwd.task1.logic.HelloLogic;

public class Hello {
    public static void main(String[] args) {
        HelloLogic hello = new HelloLogic();
        String message = hello.createHello(args);
        System.out.println(message);
    }
}