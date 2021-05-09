package by.epamtc.jwd.task3.run;

//todo Создать приложение, выводящее заданное количество случайных чисел с переходом и без
//todo перехода на новую строку.

import by.epamtc.jwd.task3.logic.RandomNumbersLogic;

public class Runner {
    public static void main(String[] args) {
        RandomNumbersLogic randomNumbers = new RandomNumbersLogic();
        String message = randomNumbers.convertArrayToString(args);
        System.out.println(message);
    }
}