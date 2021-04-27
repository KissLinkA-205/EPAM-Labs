package by.epamtc.task6.logic;

import by.epamtc.task6.validator.InputValidator;

import java.util.Calendar;

public class TaskLogic {
    public String calculateDateOfDelivery(String[] inputParameters) {
        String result;
        InputValidator checkInput = new InputValidator();
        if (checkInput.isValidInput(inputParameters)) {
            Calendar dateOfDelivery = Calendar.getInstance();
            dateOfDelivery.add(Calendar.DATE, Integer.parseInt(inputParameters[1]));

            int days = dateOfDelivery.get(Calendar.DAY_OF_MONTH);
            int month = dateOfDelivery.get(Calendar.MONTH) + 1;
            int year = dateOfDelivery.get(Calendar.YEAR);
            result = "Developer: " + inputParameters[0] +
                    "; Task will be executed on the " + days + "." + month + "." + year;
        } else {
            result = "Incorrect input";
        }

        return result;
    }
}
