import java.util.Scanner;

public class ReadInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            System.out.println(number);
        } else {
            System.out.println("Please enter an integer!");
        }
    }
}
