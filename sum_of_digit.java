import java.util.Scanner;

public class sum_of_digit {
    public static void main(String[] args) {
        // sum of a digit in number
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number :--  ");
        int n = sc.nextInt();
        int sumOfDigit = 0;

        while (n > 0) {
            sumOfDigit += n % 10;
            n = n / 10;

        }
        System.out.println("total sum  of digits :--- " + sumOfDigit);
        sc.close();
    }
}
