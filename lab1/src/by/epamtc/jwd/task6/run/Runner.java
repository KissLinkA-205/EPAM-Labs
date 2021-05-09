package by.epamtc.jwd.task6.run;

import by.epamtc.jwd.task6.unit.InputLogic;
import by.epamtc.jwd.task6.unit.TimeLogic;

public class Runner {
    public static void main(String[] args) {
        InputLogic input = new InputLogic();
        TimeLogic timeAction = new TimeLogic();

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
