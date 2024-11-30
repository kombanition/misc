import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int arr[] = new int[10];
        String stringArr[] = new String[]{"test", "test", "test"};

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(stringArr));
        System.out.println(arr[1] + " " + arr[2]);
    }
}
