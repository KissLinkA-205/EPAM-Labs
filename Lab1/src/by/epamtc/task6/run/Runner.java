package by.epamtc.task6.run;

import by.epamtc.task6.unit.InputLogics;
import by.epamtc.task6.unit.TimeLogics;

public class Runner {
    public static void main(String[] args) {

        int enteredSeconds;
        System.out.print("Введите секунды: ");
        enteredSeconds = InputLogics.inputSeconds();

        int hours = 0, minutes = 0, seconds = 0;
        hours = TimeLogics.convertToHours(enteredSeconds);
        minutes = TimeLogics.convertToMinutes(enteredSeconds);
        seconds = TimeLogics.convertToSeconds(enteredSeconds);
        System.out.print("Прошло: " + hours + " часов " + minutes + " минут " + seconds + " секунд");
    }
}
