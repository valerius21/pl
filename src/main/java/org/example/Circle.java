package org.example;

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
        return new StringBuilder()
                .append("Circle::toString() -> ")
                .append("x = ").append(x)
                .append(", y = ").append(y)
                .append(", r = ").append(radius)
                .toString();
    }

    @Override
    public void draw(Graphics g) {
        g.drawOval(x, y, radius, radius);
    }
}
