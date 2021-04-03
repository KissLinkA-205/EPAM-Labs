package by.epamtc.task2.run;

import by.epamtc.scanner.DataScanner;

public class Runner {
    public static void main(String[] args) {
        int year, month;
        System.out.print("Введите год: ");
        year = DataScanner.enterIntFromConsole();
        System.out.print("Введите номер месяца: ");
        month = by.epamtc.task2.unit.TrianleLogics.inputMonth();

        int days;
        days = by.epamtc.task2.unit.TrianleLogics.discoverNumberOfDays(year, month);
        System.out.print("Количество дней: " + days);
    }
}
