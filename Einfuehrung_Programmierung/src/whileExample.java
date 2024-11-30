

public class whileExample {
    public static void main(String[] args) {
        int i = 0;
        int j = 10;
        System.out.println("Start:");
        while (i < j) {
            System.out.println("i = " + i + " -> " + (i + 1) + ". Iteration");
            i++;
        }
        System.out.println("Ende! (j = " + j + ")");
    }
}
