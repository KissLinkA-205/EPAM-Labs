package by.epamtc.jwd.task.entity;

import java.util.ArrayList;
import java.util.List;


public class Basket {
    private List<Ball> balls;

    public Basket() {
        this.balls = new ArrayList<>();
    }

    public void putBall(Ball ball) {
        balls.add(ball);
    }

    public void removeBall(Ball ball) {
        balls.remove(ball);
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
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;

        Basket basket = (Basket) o;
        return balls.equals(basket.balls);
    }

    @Override
    public int hashCode() {
        return balls.hashCode();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "balls=" + balls + "}";
    }
}
