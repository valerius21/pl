package org.example;

import de.hans.wif.lectures.prog1.support.GraphicsPanel;

import java.awt.*;

public class GeometricObject extends GraphicsPanel.GraphicObject {
    public int x;
    public int y;


    public GeometricObject(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("Geometric::toString() -> ")
                .append("x = ").append(x)
                .append(", y = ").append(y).toString();
    }

    public double getArea() {
        return 0.;
    }

    public double getCircumference() {
        return 0.;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void draw(Graphics g) {
        g.fillRect(this.getX(), this.getY(), 1, 1);
    }
}
