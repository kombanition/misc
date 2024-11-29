import codedraw.CodeDraw;

import java.awt.*;

public class pointSpin {
    static final int ws = 650;
    static final double centerX = ws / 2;
    static final double centerY = ws / 2;

    public static void main(String[] args) {

        CodeDraw cd = new CodeDraw(ws, ws);
        double rotation = 0;
        while (true) {
            int radius = 0;
            rotation += 0.01;
            cd.clear();
            //drawCircle(cd, radius);
            for (int i = 1; i < 30; i++) {
                int brightness = 255 - (i * 6);
                if (brightness < 0) brightness = 0;
                String hexColor = String.format("%02x%02x%02x", brightness, brightness, brightness);
                int color = Integer.parseInt(hexColor, 16);
                cd.setColor(new Color(color));
                drawCirclePoints(cd, radius, 4 * i, rotation * Math.PI);
                radius += 10;
                if (radius == 300) {
                    break;
                }
            }
            cd.show();
            try {
                Thread.sleep(11);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static void drawCircle(CodeDraw cd, int radius) {
        for (int i = 1; i < 30; i++) {
            int brightness = 255 - (i * 6);
            if (brightness < 0) brightness = 0;
            String hexColor = String.format("%02x%02x%02x", brightness, brightness, brightness);
            int color = Integer.parseInt(hexColor, 16);
            cd.setColor(new Color(color));
            cd.setLineWidth(4);
            cd.drawCircle(centerX, centerY, radius);
            radius += 10;
            if (radius == 300) {
                break;
            }
        }
    }

    private static void drawCirclePoints(CodeDraw cd, int radius, int numPoints, double rotation) {
        for (int i = 0; i < numPoints; i++) {

            cd.setLineWidth(10);
            double angle = 2 * Math.PI * i / numPoints;
            double x = centerX + radius * Math.cos(angle + rotation);
            double y = centerY + radius * Math.sin(angle + rotation);
            cd.drawPoint(x, y);
        }
    }
}
