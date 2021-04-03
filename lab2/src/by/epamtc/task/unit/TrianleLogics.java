package by.epamtc.task.unit;

import by.epamtc.task.entity.Ball;
import by.epamtc.task.entity.Basket;
import by.epamtc.task.entity.Colour;

public class TrianleLogics {
    public static double inputWeight() {
        double weight;
        do {
            weight = by.epamtc.scanner.DataScanner.enterDoubleFromConsole();
        } while (weight < 0);
        return weight;
    }

    public static Colour inputColour() {
        int key;
        do {
            key = by.epamtc.scanner.DataScanner.enterIntFromConsole();
        } while (key < 1 || key > 6);

        Colour colour = switch (key) {
            case 1 -> Colour.RED;
            case 2 -> Colour.ORANGE;
            case 3 -> Colour.YELLOW;
            case 4 -> Colour.GREEN;
            case 5 -> Colour.BLUE;
            case 6 -> Colour.PURPLE;
            default -> Colour.COLOURLESS;
        };

        return colour;
    }

    public static Basket inputBasket(int ballsNumber) {
        Basket basket = new Basket();
        Ball ball;
        for (int i = 0; i < ballsNumber; i++) {
            ball = by.epamtc.task.run.Runner.inputBall(i + 1);
            basket.put(ball);
        }
        return basket;
    }
}
