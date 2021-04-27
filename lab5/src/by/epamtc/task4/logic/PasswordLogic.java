package by.epamtc.task4.logic;

import by.epamtc.task4.validator.InputValidator;

public class PasswordLogic {
    private static final String PASSWORD = "password";

    public boolean isMatch(String inputPassword) {
        boolean result = false;
        if (inputPassword.equals(PASSWORD)) {
            result = true;
        }
        return result;
    }

    public boolean checkPassword(String[] inputParameters) {
        boolean result = false;
        InputValidator checkInput = new InputValidator();
        if (checkInput.isValidInput(inputParameters) && isMatch(inputParameters[0])) {
            result = true;
        }
        return result;
    }
}
