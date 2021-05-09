package by.epamtc.jwd.task3.logic;

import by.epamtc.jwd.task3.validator.InputValidator;

public class RandomNumbersLogic {
    private static final int TEN = 10;

    public int[] createArrayOfRandomNumbers(String quantityOfNumbers) {
        int sizeOfArray = Integer.parseInt(quantityOfNumbers);
        int[] randomArray = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            randomArray[i] = (int) (Math.random() * TEN);
        }
        return randomArray;
    }

    public String convertArrayToString(String[] inputParameters) {
        StringBuilder result = new StringBuilder();
        InputValidator checkInput = new InputValidator();

        if (checkInput.isValidInput(inputParameters)) {
            int[] randomArray = createArrayOfRandomNumbers(inputParameters[0]);
            for (int index : randomArray) {
                switch (inputParameters[1]) {
                    case "1" -> result.append(index).append(" ");
                    case "2" -> result.append(index).append("\n");
                }
            }
        } else {
            result.append("""
                    Incorrect input
                    Correct format:
                    [quantity of numbers] [choice]
                    
                    choices: 
                    1 - without \\n
                    2 - with \\n""");
        }
        return result.toString();
    }
}
