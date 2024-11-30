public class ArrayCompare {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i;
            arr2[i] = i;
        }
        arr2[5] = 10;
        boolean isEqual = true;
        for (int i = 0; i < arr2.length; i++) {
            if (arr1[i] != arr2[i]) {
                isEqual = false;
                break;
            }
        }
        if (isEqual) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }
}
