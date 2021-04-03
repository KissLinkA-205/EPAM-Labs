package by.epamtc.task.unit;

import by.epamtc.task.entity.Basket;
import by.epamtc.task.entity.Colour;

public class BasketLogics {
    public static double calculateWeight(Basket basket) {
        double weight = 0;
        for (int i = 0; i < basket.getSizeOfBasket(); i++) {
            weight += basket.getBalls().get(i).getWeight();
        }
        return weight;
    }

    public static int countBallsByColour(Basket basket, Colour colour) {
        int count = 0;
        for (int i = 0; i < basket.getSizeOfBasket(); i++) {
            if (basket.getBalls().get(i).getColour() == colour) {
                count++;
            }
        }
        return count;
    }
}
