package by.epamtc.task3.validator;

public class InputValidator {
    public boolean isValidInput(String[] inputParameters) {
        boolean result = false;
        if (inputParameters.length == 2 && (inputParameters[1].equals("1") || inputParameters[1].equals("2"))
        && inputParameters[0].matches("[-+]?\\d+")) {
            result = true;
        }
        return result;
    }
}
