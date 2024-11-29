public class recursiveTest {
    public static void main(String[] args) {
        outputRecursive(10);
    }
    private static void outputRecursive(int n){
        if (n < 1){
            System.out.println("End");
        } else {
            System.out.println(n + " ");
            outputRecursive(n-1);
        }
    }
}
