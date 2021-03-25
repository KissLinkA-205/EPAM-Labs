package task6.run;

import scanner.DataScanner;

public class Runner {
    public static void main(String... args) {

        int enteredSeconds;
        do {
            System.out.print("Введите секунды: ");
            enteredSeconds = DataScanner.enterIntFromConsole();
        } while (enteredSeconds < 0);

        int hours = 0, minuts = 0, seconds = 0;
        hours = task6.unit.TrianleLogics.convertToHours(enteredSeconds);
        minuts = task6.unit.TrianleLogics.convertToMinuts(enteredSeconds);
        seconds = task6.unit.TrianleLogics.convertToSeconds(enteredSeconds);
        System.out.print("Прошло: " + hours + " часов " + minuts + " минут " + seconds + " секунд");
    }
}
