package by.epamtc.task6.validator;

public class InputValidator {
    public boolean isValidInput(String[] inputParameters) {
        boolean result = false;
        if (inputParameters.length == 2 && inputParameters[1].matches("[-+]?\\d+")) {
            result = true;
        }
        return result;
    }
}
