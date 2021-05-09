package by.epamtc.jwd.task1.validator;

public class InputValidator {
    public boolean isValidInput(String[] inputParameters) {
        boolean result = false;
        if (inputParameters.length == 1) {
            result = true;
        }
        return result;
    }
}
