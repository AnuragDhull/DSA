import java.util.Scanner;

public class matrices_multiply {


    static void printMatrix(int[][] matrix)
    {
            for(int i=0;i<matrix.length;i++)
            {
                for(int j=0;j<matrix[i].length;j++)
                {
                        System.out.print(matrix[i][j] + " ");
                }
                System.out.println( );
            } 
    }

    static void multiply (int[][] a,int r1,int c1 ,  int[][] b ,int r2,int c2)

    {
      if(c1 != r2)
      {
        System.out.println("--: Wrong Input :-- ");
        return;
      }
       int[][] mul =new int[r1][c2];
        

      for(int i=0;i<r1;i++)
      {
        for(int j=0;j<c2;j++)
        {
            for(int k=0;k<c1;k++)   // r2 also possible
            {
                mul[i][j] += (a[i][k] * b[k][j]); 
            }
        }
      }
      System.out.println(":-- Multiplication of two matrix :-- ");
      printMatrix(mul);

    }
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        System.out.print("Enter row numbers : -- ");
        int r1= sc.nextInt();
        System.out.print("Enter column numbers : -- ");
        int c1= sc.nextInt();

        System.out.println(" :-- Enter " + r1*c1 + "Elements :-- "  );

        int [][] a= new int[r1][c1];

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                a[i][j]= sc.nextInt();
            }
        }


        System.out.print("Enter row numbers : -- ");
        int r2= sc.nextInt();
        System.out.print("Enter column numbers : -- ");
        int c2= sc.nextInt();

        int [][] b= new int[r2][c2];

        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[i].length;j++)
            {
                b[i][j]= sc.nextInt();
            }
        }

        System.out.println(":-- Matrix 1 :-- ");
        printMatrix(a);
        System.out.println(":-- Matrix 2 :-- ");
        printMatrix(b);

        multiply(a,r1,c1,b,r2,c2);
      
        sc.close();
       
    }
}
