package session15_equals_hashcode_generics_enums.challenge.challenge01;

import java.util.Objects;

public class Rectangle {

    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
        System.out.println("Width set to " + width);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
        System.out.println("Height set to " + height);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return getWidth() == rectangle.getWidth() && getHeight() == rectangle.getHeight();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWidth(), getHeight());
    }
}
