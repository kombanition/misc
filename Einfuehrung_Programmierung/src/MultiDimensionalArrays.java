import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        int[][] matrix2 = {{1,2,3}, {4,5,6} , {7,8,9}};
        matrix2[1][2] = 5; // Zugriff auf Zahlenwert

        int count = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                matrix[i][j] = count;
                count++;
            }
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
