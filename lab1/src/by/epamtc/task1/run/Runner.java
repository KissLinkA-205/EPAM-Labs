package by.epamtc.task1.run;

import by.epamtc.scanner.DataScanner;
import by.epamtc.task1.unit.CalculationLogic;
import by.epamtc.task1.unit.FindLogic;

public class Runner {
    public static void main(String[] args) {
        FindLogic find = new FindLogic();
        CalculationLogic calculate = new CalculationLogic();
        int number;
        System.out.print("Введите число: ");
        number = DataScanner.enterIntFromConsole();
        
        int digit;
        digit = find.findLastDigit(number);

        number = calculate.calculateSquare(digit);
        digit = find.findLastDigit(number);
        System.out.println("Последняя цифра квадрата числа: " + digit);
    }
}
