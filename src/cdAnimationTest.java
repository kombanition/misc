import codedraw.CodeDraw;

import java.awt.*;

public class cdAnimationTest {
    public static void main(String[] args) {
        CodeDraw cd = new CodeDraw(500, 500);
        cd.setColor(Color.BLUE); // Use Color.BLUE instead of a string

        int radius = 20; // Radius of the circle
        int x = 0; // Initial x position
        int y = 250; // y position (fixed in the center)

        while (true) {
            cd.clear(); // Clear the previous frame
            cd.drawCircle(x, y, radius); // Draw the circle at the new position
            cd.show(); // Display the current frame

            x += 2; // Move the circle to the right
            if (x > cd.getWidth()) {
                x = 0; // Reset to the left if it goes off-screen
            }
            try {
                Thread.sleep(10); // Delay for smooth animation
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
