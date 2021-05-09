package by.epamtc.jwd.task2.run;

import by.epamtc.jwd.task2.logic.CommandLineLogic;

//todo Создать приложение, которое отображает в окне консоли аргументы командной строки метода
//todo main() в обратном порядке.

public class Runner {
    public static void main(String[] args) {
        CommandLineLogic argumentsInReverseOrder = new CommandLineLogic();
        String message = argumentsInReverseOrder.convertArgumentsInReverseOrder(args);
        System.out.println(message);
    }
}