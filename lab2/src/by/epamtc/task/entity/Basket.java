package by.epamtc.task.entity;

import java.util.ArrayList;
import java.util.List;


public class Basket {
    private List<Ball> balls;

    public Basket() {
        this.balls = new ArrayList<>();
    }

    public void put(Ball ball) {
        balls.add(ball);
    }

    public int getSizeOfBasket() {
        return balls.size();
    }

    public List<Ball> getBalls() {
        return balls;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return balls.equals(basket.balls);
    }

    @Override
    public int hashCode() {
        return balls.hashCode();
    }

    @Override
    public String toString() {
        return getClass().getName() + "{" +
                "balls=" + balls + "}";
    }
}
