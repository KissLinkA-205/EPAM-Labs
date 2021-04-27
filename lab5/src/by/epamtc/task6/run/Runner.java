package by.epamtc.task6.run;

//todo Приложение, выводящее фамилию разработчика и за сколько дней готов выполнить задание.
//todo Необходимо рассчитать дату и время сдачи задания. Для получения даты и времени
//todo использовать класс Calendar из пакета java.util

import by.epamtc.task6.logic.TaskLogic;

public class Runner {
    public static void main(String[] args) {
        TaskLogic calculateDate = new TaskLogic();
        String message = calculateDate.calculateDateOfDelivery(args);
        System.out.println(message);
    }
}
