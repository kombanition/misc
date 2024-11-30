public class ParameterTest {
    private static void printMax(int a, int b) {
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        printMax(x, y);
    }
}
