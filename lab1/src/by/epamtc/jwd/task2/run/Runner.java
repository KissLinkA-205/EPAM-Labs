package by.epamtc.jwd.task2.run;

import by.epamtc.jwd.scanner.DataScanner;
import by.epamtc.jwd.task2.unit.InputLogic;
import by.epamtc.jwd.task2.unit.MonthLogic;

public class Runner {
    public static void main(String[] args) {
        InputLogic input = new InputLogic();
        MonthLogic monthAction = new MonthLogic();

        int year, month;
        System.out.print("Введите год: ");
        year = DataScanner.enterIntFromConsole();
        System.out.print("Введите номер месяца: ");
        month = input.inputMonth();

        int days;
        days = monthAction.discoverNumberOfDays(year, month);
        System.out.print("Количество дней: " + days);
    }
}
