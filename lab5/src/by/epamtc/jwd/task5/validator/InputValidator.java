package by.epamtc.jwd.task5.validator;

public class InputValidator {
    public boolean isValidInput(String[] inputParameters) {
        boolean result = true;
        if(inputParameters.length == 0) {
            return false;
        }
        for (String parameter : inputParameters) {
            if (!parameter.matches("[-+]?\\d+")) {
                result = false;
                break;
            }
        }
        return result;
    }
}
