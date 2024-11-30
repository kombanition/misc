public class AssuranceTest {
    public static int max(int a, int b) {
        assert a > 0 && b > 0 : "Only numbers greater than 0!";
        if (a > b) return a;
        else return b;
    }
    public static void main(String[] args) {
        max(4, -5);
    }
}

// Damit assert funktioniert muss in der Configuration unter VM-Options -ea eingegeben werden.