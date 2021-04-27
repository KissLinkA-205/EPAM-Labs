package by.epamtc.task4.run;

//todo Создать приложение для ввода пароля из командной строки и сравнения его со строкой образцом.

import by.epamtc.task4.logic.PasswordLogic;

public class Runner {
    public static void main(String[] args) {
        PasswordLogic password = new PasswordLogic();
        System.out.println(password.checkPassword(args));
    }
}
