package by.epamtc.task.run;

import by.epamtc.task.entity.Ball;
import by.epamtc.task.entity.Basket;
import by.epamtc.task.entity.Colour;

public class Runner {
    public static void main(String[] args) {
        int ballsNumber;
        Basket basket;
        System.out.println("Сколько шариков будет в корзине?");
        ballsNumber = by.epamtc.scanner.DataScanner.enterIntFromConsole();
        System.out.println("Ввод карзины:");
        basket = by.epamtc.task.unit.TrianleLogics.inputBasket(ballsNumber);
        System.out.println("Полученная корзина:");
        System.out.print(basket);

        double weight = by.epamtc.task.unit.BasketLogics.calculateWeight(basket);
        System.out.printf("\nВес всех шариков в корзине: %.3f", weight);
        int count = by.epamtc.task.unit.BasketLogics.countBallsByColour(basket, Colour.BLUE);
        System.out.println("\nКоличество синих шариков в корзине: " + count);

    }

    public static Ball inputBall(int index) {
        Ball ball = new Ball();
        double weight;
        Colour colour;
        System.out.println("Введите вес " + index + " шарика: ");
        weight = by.epamtc.task.unit.TrianleLogics.inputWeight();
        ball.setWeight(weight);

        System.out.println("Введите цвет " + index + " шарика: " +
                "\n1 - красный" +
                "\n2 - оранжевый" +
                "\n3 - желтый" +
                "\n4 - зеленый" +
                "\n5 - синий" +
                "\n6 - фиолетовый");
        colour = by.epamtc.task.unit.TrianleLogics.inputColour();
        ball.setColour(colour);

        return ball;
    }
}
