import java.util.Arrays;

public class arrays_cloning {
    static void arrayPrint(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr1[] = {10, 20, 30, 40, 50};

        int arr2[] = Arrays.copyOf(arr1, arr1.length);

        arrayPrint(arr1);
        arrayPrint(arr2);
    }
}
