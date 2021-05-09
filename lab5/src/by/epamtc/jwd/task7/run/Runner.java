package by.epamtc.jwd.task7.run;

//todo Создать приложение, получающее дату рождения (день, месяц и год) и определяющее в какой
//todo день недели Вы родились, сколько Вам полных лет и поздравляет с днем рождения, если оно
//todo сегодня (использовать класс Calendar из пакета java.util).

import by.epamtc.jwd.task7.logic.CalendarLogic;

public class Runner {
    public static void main(String[] args) {
        CalendarLogic birthday = new CalendarLogic();
        String dayOfWeek = birthday.findBirthdayInWeek(args);
        int age = birthday.calculateAge(args);
        System.out.println("You were born on " + dayOfWeek + "\nYour age: " + age);
        System.out.println(birthday.createCongratulation(args));
    }
}
