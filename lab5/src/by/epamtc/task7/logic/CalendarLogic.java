package by.epamtc.task7.logic;

import by.epamtc.task7.validator.InputValidator;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarLogic {
    public Calendar convertToCalendar(String[] inputParameters) {
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.YEAR, Integer.parseInt(inputParameters[2]));
        calendar.set(Calendar.MONTH, Integer.parseInt(inputParameters[1]) - 1);
        calendar.set(Calendar.DAY_OF_MONTH, Integer.parseInt(inputParameters[0]) - 1);

        return calendar;
    }

    public String findBirthdayInWeek(String[] inputParameters) {
        String dayOfWeek;
        InputValidator checkInput = new InputValidator();
        Calendar birthday = convertToCalendar(inputParameters);

        if (checkInput.isValidInput(inputParameters)) {
            switch (birthday.get(Calendar.DAY_OF_WEEK)) {
                case 1 -> dayOfWeek = "Monday";
                case 2 -> dayOfWeek = "Tuesday";
                case 3 -> dayOfWeek = "Wednesday";
                case 4 -> dayOfWeek = "Thursday";
                case 5 -> dayOfWeek = "Friday";
                case 6 -> dayOfWeek = "Saturday";
                case 7 -> dayOfWeek = "Sunday";
                default -> dayOfWeek = " ";
            }
        } else {
            dayOfWeek = " ";
        }
        return dayOfWeek;
    }

    public int calculateAge(String[] inputParameters) {
        int age;
        InputValidator checkInput = new InputValidator();
        Calendar birthday = convertToCalendar(inputParameters);

        if (checkInput.isValidInput(inputParameters)) {
            Calendar currentDate = Calendar.getInstance();
            age = currentDate.get(Calendar.YEAR) - birthday.get(Calendar.YEAR);
            if(currentDate.get(Calendar.MONTH) - birthday.get(Calendar.MONTH) < 0 ||
                    currentDate.get(Calendar.DAY_OF_MONTH) - birthday.get(Calendar.DAY_OF_MONTH) < 0) {
                age--;
            }
        } else {
            age = 0;
        }
        return age;
    }

    public String createCongratulation(String[] inputParameters) {
        String result;
        InputValidator checkInput = new InputValidator();
        Calendar birthday = convertToCalendar(inputParameters);

        if (checkInput.isValidInput(inputParameters)) {
            Calendar currentDate = Calendar.getInstance();
            if (birthday.get(Calendar.DAY_OF_MONTH) == currentDate.get(Calendar.DAY_OF_MONTH) - 1 &&
                    birthday.get(Calendar.MONTH) == currentDate.get(Calendar.MONTH)) {
                result = "Happy birthday!";
            } else {
                result = " ";
            }
        } else {
            result = " ";
        }
        return result;
    }
}
