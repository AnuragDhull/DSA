public class arrays_checkSorted {
    public static void main(String[] args) {
        int[] arr = {10, 40, 20, 30, 60};
        boolean isSorted = true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                isSorted = false;
                break;
            }
        }

        if (!isSorted) {
            System.out.println("Array not sorted");
        } else {
            System.out.println("Array sorted");
        }
    }
}
