package by.epamtc.task7.validator;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class InputValidator {
    public boolean isValidInput(String[] inputParameters) {
        boolean result = true;
        if (inputParameters.length == 3) {
            for (int i = 0; i < 3; i++) {
                if (!inputParameters[i].matches("[-+]?\\d+")) {
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }
        if (result) {
            result = isValidDate(inputParameters);
        }
        return result;
    }

    public boolean isValidDate(String[] inputParameters) {
        boolean result = true;
        int day = Integer.parseInt(inputParameters[0]);
        int month = Integer.parseInt(inputParameters[1]);
        int year = Integer.parseInt(inputParameters[2]);

        if (year < 0) {
            result = false;
        } else if (month >= 1 && month <= 12) {
            Calendar calendar = new GregorianCalendar();
            calendar.set(Calendar.YEAR, year);
            calendar.set(Calendar.MONTH, month);
            if (!(day > 0 && day <= calendar.getActualMaximum(Calendar.DAY_OF_MONTH))) {
                result = false;
            }
        } else {
            result = false;
        }
        return result;
    }
}
