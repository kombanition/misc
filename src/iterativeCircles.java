import codedraw.CodeDraw;
import codedraw.Palette;

public class iterativeCircles {
    final static int ws = 512;
    public static void main(String[] args) {
        CodeDraw cd = new CodeDraw(ws, ws);
        for(int i = 1; i < 6; i++) {
            drawCircles(cd, (int) Math.pow(2, i));
        }
        cd.show();
    }

    public static void drawCircles(CodeDraw cd, int numCircles){
        for (int i = 0; i < numCircles; i++) {
            cd.setColor(Palette.BLACK);
            double centerY = 512 / numCircles;
            cd.drawCircle(256, centerY + centerY * i, centerY /2);
        }
    }
}
