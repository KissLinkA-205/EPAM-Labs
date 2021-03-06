package by.epamtc.jwd.task.logic;

import by.epamtc.jwd.task.entity.Basket;
import by.epamtc.jwd.task.entity.Colour;

public class BasketLogic {
    public double calculateWeight(Basket basket) {
        double weight = 0;
        for (int i = 0; i < basket.getSizeOfBasket(); i++) {
            weight += basket.getBalls().get(i).getWeight();
        }
        return weight;
    }

    public int countBallsByColour(Basket basket, Colour colour) {
        int count = 0;
        for (int i = 0; i < basket.getSizeOfBasket(); i++) {
            if (basket.getBalls().get(i).getColour() == colour) {
                count++;
            }
        }
        return count;
    }
}
