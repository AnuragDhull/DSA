import java.util.Scanner;

public class basics_1 {
    public static void main(String[] args) {
        System.out.println("Hello world !!!!");

        int x;
        x = 5;
        System.out.println(x);

        int y = 10;
        int z = x + y;
        System.out.println(z);

        double p = 5;
        double q = 2;
        System.out.println(p / q);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of a circle :-- ");
        int r = sc.nextInt();
        double area = 3.14 * r * r;

        System.out.println("area of a circle is :-- " + area);

        System.out.print("Enter a number c :-- ");
        double c = sc.nextDouble();
        System.out.print("Enter a number b :-- ");
        double d = sc.nextDouble();

        System.out.println("sum  :--" + (c + d));

        // find remainder of a given number
        System.out.print("enter dividend :--");
        int dividend = sc.nextInt();

        System.out.print("enter a divisor :-- ");
        int divisor = sc.nextInt();

        int remainder = dividend - divisor * (dividend / divisor);
        System.out.print("Remainder of a given number is :-- " + remainder);

        // direct remainder
        int n = 45;
        int m = 8;
        int o = m % n;
        System.out.println(o);

        char ch = '@';
        System.out.println(ch);
        int u = (int) ch;
        System.out.println(u);

        sc.close();

    }
}