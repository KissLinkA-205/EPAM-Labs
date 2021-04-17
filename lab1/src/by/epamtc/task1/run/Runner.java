package by.epamtc.task1.run;

import by.epamtc.scanner.DataScanner;
import by.epamtc.task1.unit.CalculationLogics;
import by.epamtc.task1.unit.FindLogics;

public class Runner {
    public static void main(String[] args) {
        FindLogics find = new FindLogics();
        CalculationLogics calculate = new CalculationLogics();
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
