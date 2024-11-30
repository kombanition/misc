import java.util.Arrays;

public class ArrayCopyExample {
    public static void main(String[] args) {
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        int copy[] = new int[arr.length];
        int clone[] = arr.clone();
        System.arraycopy(arr, 1, copy, 0, arr.length - 1);
        System.out.println("orginal " + Arrays.toString(arr));
        System.out.println("copy " + Arrays.toString(copy));
        System.out.println("clone " + Arrays.toString(clone));
    }
}
