import java.util.Scanner;

public class count_of_digit {
    public static void main(String[] args) {
        // count of a digit in number
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number :--  ");
        int n = sc.nextInt();

        int numOfDidgit = 0;

        while (n > 0) {
            n = n / 10;
            numOfDidgit++;

        }
        System.out.println("total nymber of digits :--- " + numOfDidgit);

        sc.close();
    }
}
