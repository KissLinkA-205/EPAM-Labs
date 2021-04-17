package by.epamtc.task.logic;

import by.epamtc.scanner.DataScanner;
import by.epamtc.task.entity.Colour;

public class InputLogics {
    public double inputWeight() {
        double weight;
        do {
            weight = DataScanner.enterDoubleFromConsole();
        } while (weight < 0);
        return weight;
    }

    public Colour inputColour() {
        int key;
        do {
            key = DataScanner.enterIntFromConsole();
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
}
