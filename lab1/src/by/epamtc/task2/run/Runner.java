package by.epamtc.task2.run;

import by.epamtc.scanner.DataScanner;
import by.epamtc.task2.unit.InputLogics;
import by.epamtc.task2.unit.MonthLogics;

public class Runner {
    public static void main(String[] args) {
        int year, month;
        System.out.print("Введите год: ");
        year = DataScanner.enterIntFromConsole();
        System.out.print("Введите номер месяца: ");
        month = InputLogics.inputMonth();

        int days;
        days = MonthLogics.discoverNumberOfDays(year, month);
        System.out.print("Количество дней: " + days);
    }
}
