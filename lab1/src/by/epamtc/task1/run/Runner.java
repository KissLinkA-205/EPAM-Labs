package by.epamtc.task1.run;

import by.epamtc.scanner.DataScanner;
import by.epamtc.task1.unit.CalculationLogics;
import by.epamtc.task1.unit.FindLogics;

public class Runner {
    public static void main(String[] args) {
        int number;
        System.out.print("Введите число: ");
        number = DataScanner.enterIntFromConsole();
        
        int digit;
        digit = FindLogics.findLastDigit(number);

        number = CalculationLogics.calculateSquare(digit);
        digit = FindLogics.findLastDigit(number);
        System.out.println("Последняя цифра квадрата числа: " + digit);
    }
}
