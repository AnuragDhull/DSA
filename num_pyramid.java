import java.util.Scanner;

public class num_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the pyramid: ");
        int r = sc.nextInt();

        for (int i = 1; i <= r; i++) {
            // Print spaces
            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }

            // Print 1 to i

            for(int k=1;k<=i;k++)
            {
                System.out.print(k);
            }
            // Print i-1 to i 
            for(int l=i-1;l>=1;l--)
            {
                System.out.print(l);
            }

            // Move to the next line after each row
            System.out.println();
        }
        sc.close();
        
    }
}
