package me.valerius;

import de.hans.wif.lectures.prog1.support.GraphicsPanel;
import me.valerius.geometrics.Circle;
import me.valerius.geometrics.Rectangle;
import me.valerius.geometrics.SegmentCircle;

public class Main {

    public static void h52() {
        Rectangle r = new Rectangle(200, 130, 100, 50);
        Circle c = new Circle(320, 240, 50);
        GraphicsPanel graphicsPanel = new GraphicsPanel(640, 480, "Übungsblatt 7, Aufgabe 5");
        graphicsPanel.addGraphicObject(r);
        graphicsPanel.addGraphicObject(c);
    }

    public static void h62() {
        GraphicsPanel graphicsPanel = new GraphicsPanel(640, 480, "Übungsblatt 7, Aufgabe 6");

        // x = 640
        // y = 480

        Rectangle r = new Rectangle(640 / 2, 320, 20, 160);
        Circle c = new Circle((640 / 2) - 20, 260, 60);
        SegmentCircle sc = new SegmentCircle((640 / 2) - 35, 290, 90, 0, 180);

        // Right corner circle
        Circle rc = new Circle(640 - 100, -100, 200);

        graphicsPanel.addGraphicObject(r);
        graphicsPanel.addGraphicObject(c);
        graphicsPanel.addGraphicObject(sc);
        graphicsPanel.addGraphicObject(rc);
    }

    public static void main(String[] args) {
        h62();
    }
}