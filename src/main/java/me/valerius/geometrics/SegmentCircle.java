package me.valerius.geometrics;

import java.awt.*;

public class SegmentCircle extends GeometricObject {
    public int radius, startAngle, endAngle;

    public SegmentCircle(int x, int y, int radius, int startAngle, int endAngle) {
        super(x, y);

        this.radius = radius;
        this.endAngle = endAngle;
        this.startAngle = startAngle;
    }

    @Override
    public String toString() {
        return "SegmentCircle::toString() -> " +
                "x = " + x +
                ", y = " + y +
                ", r = " + radius +
                ", startAngle = " + startAngle +
                ", endAngle = " + endAngle;
    }

    @Override
    public void draw(Graphics g) {
        g.fillArc(x, y, radius, radius, startAngle, endAngle);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getStartAngle() {
        return startAngle;
    }

    public void setStartAngle(int startAngle) {
        this.startAngle = startAngle;
    }

    public int getEndAngle() {
        return endAngle;
    }

    public void setEndAngle(int endAngle) {
        this.endAngle = endAngle;
    }
}
