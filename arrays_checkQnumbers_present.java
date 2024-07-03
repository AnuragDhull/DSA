import java.util.Scanner;

public class arrays_checkQnumbers_present {

    // Method to create frequency array from given array
    static int[] makeFrequencyArray(int[] arr) {
        int[] freq = new int[100005]; // Assuming max value in arr is 100000 (adjust as needed)

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example array
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        // Create frequency array
        int[] freq = makeFrequencyArray(arr);

        // Input number of queries
        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();

        while (q > 0) {
            System.out.print("Enter a number to be searched: ");
            int x = sc.nextInt();

            // Check if x is present in freq array
            if (x >= 0 && x < freq.length && freq[x] > 0) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

            q--;
        }

        sc.close(); // Close scanner after usage
    }
}
