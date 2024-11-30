import codedraw.CodeDraw;
import codedraw.Palette;

public class cdRecursion {
    private static void drawSquares(CodeDraw cd, double x, double y, double length){
        if(length > 1){
            drawSquares(cd, x + length, y + length, length / 2);
            cd.setColor(Palette.BURLY_WOOD);
            cd.fillSquare(x, y, length);
            cd.show(1000);

        }
    }
    public static void main(String[] args) {
        int size = 512;
        CodeDraw cd = new CodeDraw(size, size);
        drawSquares(cd, 0, 0, (double) size/2.0);
        cd.show();
    }
}
