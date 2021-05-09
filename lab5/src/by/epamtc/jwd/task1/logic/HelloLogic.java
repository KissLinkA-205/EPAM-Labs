package by.epamtc.jwd.task1.logic;

import by.epamtc.jwd.task1.validator.InputValidator;

public class HelloLogic {
    public String createHello(String[] inputParameters) {
        String result;
        InputValidator checkInput = new InputValidator();
        if (checkInput.isValidInput(inputParameters)) {
            result = "Hello, " + inputParameters[0] + "!";
        } else {
            result = "Wrong name";
        }
        return result;
    }
}