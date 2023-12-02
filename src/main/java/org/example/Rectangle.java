package org.example;

import java.awt.*;

public class Rectangle extends GeometricObject {
    public int height, width;

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);

        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public double getCircumference() {
        return 2 * (this.height + this.width);
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("Rectangle::toString() -> ")
                .append("x = ").append(x)
                .append(", y = ").append(y).toString();
    }

    @Override
    public void draw(Graphics g) {
        g.fillRect(x, y, width, height);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
