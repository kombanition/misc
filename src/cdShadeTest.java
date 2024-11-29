import codedraw.CodeDraw;
import java.awt.Color;

public class cdShadeTest {
    public static void main(String[] args) {
        int ws = 400;
        CodeDraw cd = new CodeDraw(ws, ws);
        Color shade1 = new Color(0x404040);
        Color shade2 = new Color(0x696969);
        Color shade3 = new Color(0x929292);
        Color shade4 = new Color(0xBBBBBB);
        Color shade5 = new Color(0xE4E4E4);

        cd.setLineWidth(1);
        cd.setColor(shade1);
        cd.drawCircle(200, 200, 70);
        cd.setLineWidth(2);
        cd.setColor(shade2);
        cd.drawCircle(200, 200, 69);
        cd.setLineWidth(3);
        cd.setColor(shade3);
        cd.drawCircle(200, 200, 67);
        cd.setLineWidth(4);
        cd.setColor(shade4);
        cd.drawCircle(200, 200, 64);
        cd.setLineWidth(5);
        cd.setColor(shade5);
        cd.drawCircle(200, 200, 60);

        cd.show();

    }
}
