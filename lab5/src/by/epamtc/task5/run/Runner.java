package by.epamtc.task5.run;

//todo Создать программу ввода целых чисел как аргументов командной строки, подсчета их суммы
//todo (произведения) и вывода результата на консоль.

import by.epamtc.task5.logic.CalculateLogic;

public class Runner {
    public static void main(String[] args) {
        CalculateLogic calculate = new CalculateLogic();
        System.out.println(calculate.getResult(args));
    }
}
