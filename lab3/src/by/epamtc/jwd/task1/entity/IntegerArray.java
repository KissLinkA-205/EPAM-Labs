package by.epamtc.jwd.task1.entity;

public class IntegerArray {
    private int[] values;

    public IntegerArray(int[] array) {
        this.values = array;
    }

    public int[] getValues() {
        return this.values;
    }

    public void setValues(int[] values) {
        this.values = values;
    }

    @Override
    public int hashCode() {
        int result = 1;
        int prime = 31;

        for (int value : this.values) {
            result += value * prime;
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;

        IntegerArray array = (IntegerArray) o;
        if (this.values.length != array.values.length) return false;

        boolean result = true;
        for (int i = 0; i < this.values.length; i++) {
            if (this.values[i] != array.values[i]) {
                result = false;
                break;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(getClass().getSimpleName() + "{ " +
                "values=[");
        for (int i = 0; i < this.values.length; i++) {
            stringBuilder.append(values[i]);
            if (i != this.values.length - 1) stringBuilder.append(", ");
        }
        stringBuilder.append("]");
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }
}