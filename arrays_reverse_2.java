public class arrays_reverse_2 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 1, 2, 2, 0, 2};

        System.out.println("Original Array:");
        printArray(arr);

        reverseArray(arr);

        System.out.println("\nArray after reversing:");
        printArray(arr);
    }

    // Method to reverse the array without using a new array
    public static void reverseArray(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while (i < j) {
            // Swap elements at i and j
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            // Move to the next pair
            i++;
            j--;
        }
    }

    // Method to print elements of the array
    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
