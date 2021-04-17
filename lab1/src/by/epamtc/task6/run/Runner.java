package by.epamtc.task6.run;

import by.epamtc.task6.unit.InputLogics;
import by.epamtc.task6.unit.TimeLogics;

public class Runner {
    public static void main(String[] args) {
        InputLogics input = new InputLogics();
        TimeLogics timeAction = new TimeLogics();

        int enteredSeconds;
        System.out.print("Введите секунды: ");
        enteredSeconds = input.inputSeconds();

        int hours = 0, minutes = 0, seconds = 0;
        hours = timeAction.convertToHours(enteredSeconds);
        minutes = timeAction.convertToMinutes(enteredSeconds);
        seconds = timeAction.convertToSeconds(enteredSeconds);
        System.out.print("Прошло: " + hours + " часов " + minutes + " минут " + seconds + " секунд");
    }
}
