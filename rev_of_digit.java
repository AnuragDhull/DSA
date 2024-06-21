import java.util.Scanner;

public class rev_of_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number :-- ");
        int n = sc.nextInt();
        int ans = 0;
        while (n > 0) {
            ans = ans * 10 + n % 10;
            n = n / 10;

        }
        System.out.println("revers of your number :-- " + ans);
        sc.close();

    }
}
