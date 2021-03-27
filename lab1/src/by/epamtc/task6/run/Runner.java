package by.epamtc.task6.run;

import by.epamtc.scanner.DataScanner;

public class Runner {
    public static void main(String... args) {

        int enteredSeconds;
        do {
            System.out.print("Введите секунды: ");
            enteredSeconds = DataScanner.enterIntFromConsole();
        } while (enteredSeconds < 0);

        int hours = 0, minuts = 0, seconds = 0;
        hours = by.epamtc.task6.unit.TrianleLogics.convertToHours(enteredSeconds);
        minuts = by.epamtc.task6.unit.TrianleLogics.convertToMinuts(enteredSeconds);
        seconds = by.epamtc.task6.unit.TrianleLogics.convertToSeconds(enteredSeconds);
        System.out.print("Прошло: " + hours + " часов " + minuts + " минут " + seconds + " секунд");
    }
}
