package by.epamtc.task.run;

import by.epamtc.task.entity.Ball;
import by.epamtc.task.entity.Basket;
import by.epamtc.task.entity.Colour;
import by.epamtc.task.logic.BasketLogics;
import by.epamtc.task.logic.InputLogics;

public class Runner {
    public static void main(String[] args) {
        Basket basket = new Basket();
        System.out.println("Ввод карзины:");
        System.out.println("Введите параметры 1 шарика");
        Ball ball1 = inputBall();
        System.out.println("Введите параметры 2 шарика");
        Ball ball2 = inputBall();
        System.out.println("Введите параметры 3 шарика");
        Ball ball3 = inputBall();

        basket.putBall(ball1);
        basket.putBall(ball2);
        basket.putBall(ball3);

        System.out.println("Полученная корзина:");
        System.out.print(basket);

        double weight = BasketLogics.calculateWeight(basket);
        System.out.printf("\nВес всех шариков в корзине: %.3f", weight);
        int count = BasketLogics.countBallsByColour(basket, Colour.BLUE);
        System.out.println("\nКоличество синих шариков в корзине: " + count);
    }

    public static Ball inputBall() {
        Ball ball = new Ball();
        double weight;
        Colour colour;
        System.out.println("Введите вес шарика: ");
        weight = InputLogics.inputWeight();
        ball.setWeight(weight);

        System.out.println("Введите цвет шарика: " +
                "\n1 - красный" +
                "\n2 - оранжевый" +
                "\n3 - желтый" +
                "\n4 - зеленый" +
                "\n5 - синий" +
                "\n6 - фиолетовый");
        colour = InputLogics.inputColour();
        ball.setColour(colour);

        return ball;
    }
}
