package me.valerius.geometrics;

import java.awt.*;

public class Circle extends GeometricObject {
    public int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    @Override
    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle::toString() -> " +
                "x = " + x +
                ", y = " + y +
                ", r = " + radius;
    }

    @Override
    public void draw(Graphics g) {
        g.fillOval(x, y, radius, radius);
    }
}
