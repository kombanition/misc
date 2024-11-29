public class NumberTest {
    public static void main(String[] args) {
        for (int i = 0; i <= 1000; i++) {
            System.out.println(numberAdder(i) + "\t" + numberSquared(i));
        }
    }

    public static int numberAdder(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num;
            num -= 1;
        }
        return sum;
    }

    public static int numberSquared(int num) {
        return num * num;
    }
}
