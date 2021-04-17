package by.epamtc.task.entity;

public class Ball {
    private double weight;
    private Colour colour;

    public Ball() {
        this.weight = 0;
        this.colour = Colour.COLOURLESS;
    }

    public Ball(double weight, Colour colour) {
        this.weight = weight;
        this.colour = colour;
    }

    public double getWeight() {
        return this.weight;
    }

    public Colour getColour() {
        return this.colour;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;

        Ball ball = (Ball) o;
        return Double.compare(ball.weight, weight) == 0 && colour == ball.colour;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (int) Double.doubleToLongBits(weight);
        result = 31 * result + colour.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "\n"+ getClass().getSimpleName() + "{" +
                "weight=" + weight +
                ", color='" + colour.getColour() + "}";
    }
}
