package org.example;

import de.hans.wif.lectures.prog1.support.GraphicsPanel;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(200, 130, 100, 50);
        Circle c = new Circle(320, 240, 50);
        GraphicsPanel graphicsPanel = new GraphicsPanel(640, 480, "Übungsblatt 7, Aufgabe 5");
        graphicsPanel.addGraphicObject(r);
        graphicsPanel.addGraphicObject(c);
    }
}