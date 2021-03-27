package by.epamtc.task2.run;

import by.epamtc.scanner.DataScanner;

public class Runner {
    public static void main(String... args) {
        int year, month;
        System.out.print("Введите год: ");
        year = DataScanner.enterIntFromConsole();
        do {
            System.out.print("Введите номер месяца: ");
            month = DataScanner.enterIntFromConsole();
        } while (month < 1 || month > 12);

        int days;
        days = by.epamtc.task2.unit.TrianleLogics.numberOfDays(year, month);
        System.out.print("Количество дней: " + days);
    }
}
