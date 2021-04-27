package by.epamtc.task4.validator;

public class InputValidator {
    public boolean isValidInput(String[] inputParameters) {
        boolean result = false;
        if (inputParameters.length == 1) {
            result = true;
        }
        return result;
    }
}
