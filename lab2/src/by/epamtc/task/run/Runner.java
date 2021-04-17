package by.epamtc.task.run;

import by.epamtc.task.entity.Ball;
import by.epamtc.task.entity.Basket;
import by.epamtc.task.entity.Colour;
import by.epamtc.task.logic.BasketLogics;
import by.epamtc.task.logic.InputLogics;

public class Runner {
    public static void main(String[] args) {
        Basket basket = new Basket();
        BasketLogics basketAction = new BasketLogics();

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

        double weight = basketAction.calculateWeight(basket);
        System.out.printf("\nВес всех шариков в корзине: %.3f", weight);
        int count = basketAction.countBallsByColour(basket, Colour.BLUE);
        System.out.println("\nКоличество синих шариков в корзине: " + count);
    }

    public static Ball inputBall() {
        Ball ball = new Ball();
        InputLogics input = new InputLogics();
        double weight;
        Colour colour;
        System.out.println("Введите вес шарика: ");
        weight = input.inputWeight();
        ball.setWeight(weight);

        System.out.println("""
                Введите цвет шарика:\s
                1 - красный
                2 - оранжевый
                3 - желтый
                4 - зеленый
                5 - синий
                6 - фиолетовый""");
        colour = input.inputColour();
        ball.setColour(colour);

        return ball;
    }
}
