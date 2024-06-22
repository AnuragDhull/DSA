import java.util.Scanner;

public class num_pattren {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int c = sc.nextInt();

        for(int i=0;i<=r;i++)
        {
            for(int j=0;j<=c;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print(1);
                }
                else
                {
                    System.out.print(2);
                }
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
