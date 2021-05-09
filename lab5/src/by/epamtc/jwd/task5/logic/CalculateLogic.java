package by.epamtc.jwd.task5.logic;

import by.epamtc.jwd.task5.validator.InputValidator;

public class CalculateLogic {
    public double calculateSum(String[] numbers) {
        double sum = 0;
        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }
        return sum;
    }

    public double calculateComposition(String[] numbers) {
        double composition = 1;
        for (String number : numbers) {
            composition *= Integer.parseInt(number);
        }
        return composition;
    }

    public String getResult(String[] inputParameters) {
        StringBuilder result = new StringBuilder();
        InputValidator checkInput = new InputValidator();

        if(checkInput.isValidInput(inputParameters)) {
            result.append("Sum: ").append(calculateSum(inputParameters)).
                    append("\nComposition: ").append(calculateComposition(inputParameters));
        } else {
            result.append("Incorrect input");
        }
        return result.toString();
    }
}
