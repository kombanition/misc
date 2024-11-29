public class testTest {
    private static String fun(String a, String b) {
        System.out.print(b);                            // Zeile A
        return a;
    }

    public static void main(String[] args) {
        String x = "AB";
        String y = "34";
        System.out.print(x + fun(x, y));
    }
}
