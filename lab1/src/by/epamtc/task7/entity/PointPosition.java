package by.epamtc.task7.entity;

public enum PointPosition {
    FIRST_POINT_IS_CLOSER("Точка A находится ближе к началу координат"),
    SECOND_POINT_IS_CLOSER("Точка B находится ближе к началу координат"),
    DESTINATION_IS_THE_SAME("Точки равноудалены от начала координат");
    private String state;

    PointPosition(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
