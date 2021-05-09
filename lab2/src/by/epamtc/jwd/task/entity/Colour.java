package by.epamtc.jwd.task.entity;

public enum Colour{
    RED("Красный"),
    ORANGE("Оранжевый"),
    YELLOW("Жёлтый"),
    GREEN("Зеленый"),
    BLUE("Синий"),
    PURPLE("Фиолетовый"),
    COLOURLESS("Бесцветный");
    private final String colour;

    Colour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return this.colour;
    }
}
