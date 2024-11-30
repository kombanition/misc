import codedraw.*;

public class CodeDrawTest {
    public static void main(String[] args) {

        int width = 400, height = 400;
        CodeDraw figure = new CodeDraw(width,height);
        figure.setLineWidth(5);
        int numberOfLines = 11;
        int increment = height / numberOfLines;
        int startY = increment / 2;
        int startX = increment / 6;
        int distance = increment / 3;
        int count = 0;
        for(int y = startY; y < height; y += increment){
            figure.drawLine(0,y,width - 3,y);
            for(int x = startX; x < width; x += increment){
                if (count % 2 == 1){
                    figure.drawLine(x,y - distance,x+increment,y + distance);
                } else {
                    figure.drawLine(x + increment,y - distance,x,y + distance);
                }
            }
        }
        figure.show();
    }
}
