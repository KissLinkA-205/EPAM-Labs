package by.epamtc.task2.logic;

public class CommandLineLogic {
    public String convertArgumentsInReverseOrder(String[] inputParameters) {
        StringBuilder result = new StringBuilder();
        for (int i = inputParameters.length - 1; i >= 0; i--) {
            result.append(inputParameters[i]).append(" ");
        }
        return result.toString();
    }
}