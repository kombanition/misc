import codedraw.CodeDraw;

public class cdExperiment1 {
    public static void main(String[] args) {
        int ws = 400;
        CodeDraw cd = new CodeDraw(ws, ws);

        int centerX = ws/2;
        int centerY = ws/2;
        int radius = 150;
        int linesPerCircle = 50;
        double rotation = 0;

        while(true) {
            cd.clear();
            for(int i = 0; i < linesPerCircle / 4; i++) {
                double angle = 2 * Math.PI / linesPerCircle;
                cd.drawLine(centerX + (radius * Math.sin(angle * i + rotation))/3,
                        centerY + (radius * Math.cos(angle * i + rotation))/3,
                        centerX + radius * Math.sin(angle * i  + rotation),
                        centerY + radius * Math.cos(angle * i + rotation));
            }
            rotation += 2 * Math.PI / linesPerCircle;

            if (cd.isClosed()){
                break;
            }
            try { // needed for Thread.sleep, cannot give further explanation
                Thread.sleep(30); // For smooth animation, app. 90 fps, changes frame every 11 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace(); // Handle the exception if the thread is interrupted
            }
            cd.show();
        }


        cd.show();
    }
}
