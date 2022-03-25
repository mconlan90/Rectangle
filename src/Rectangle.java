import javax.swing.*;

public class Rectangle {
    private float length;
    private float width;
    private float perimeter;

    public Rectangle() {
        length = 1.0F;
        width = 1.0F;
        perimeter = 0.0F;
        JOptionPane.showMessageDialog(null, "New Rectangle object created.");
    }

    public void setLength(float l) {
        length = l;
    }

    public float getLength() {
        return length;
    }

    public void setWidth(float w) {
        width = w;
    }

    public float getWidth() {
        return width;
    }

    public float calculatePerimeter(float l, float w) {
        perimeter = (getLength() * 2) + (getWidth() * 2);
        return perimeter;
    }

    public void showResult() {
        JOptionPane.showMessageDialog(null, calculatePerimeter(length, width));
    }
}