public class arrays_2ndMax {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5, 6, 1, 2, 2, 0, 2};
        
        int max1 = Integer.MIN_VALUE;  // First maximum
        int max2 = Integer.MIN_VALUE;  // Second maximum

        // Find the first maximum
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max1 = arr[i];
            }
        }

        // Find the second maximum
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max2 && arr[i] < max1) {
                max2 = arr[i];
            }
        }

        System.out.println("First maximum: " + max1);
        System.out.println("Second maximum: " + max2);
    }
}
