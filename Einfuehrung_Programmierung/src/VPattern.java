public class VPattern {
    public static void main(String[] args) {
        int n = 30;
        int width = 2 * n - 1;
        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <= width; column++) {
                if (column == row || width - column + 1 == row) {
                    System.out.print('v');
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}
