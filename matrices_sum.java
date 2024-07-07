import java.util.Scanner;

public class matrices_sum {


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

    static void add (int[][] a,int r1,int c1 ,  int[][] b ,int r2,int c2)

    {
        if(r1!=r2  || c1!=c2)
        {
            System.out.println("--: Wrong Input :-- ");
            return;
        }
       
        int [][] sum =new int[r1][c1];   // u can use r2 or c2 

        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                sum[i][j]=  a[i][j] + b[i][j];

            } 
        }
        System.out.println("--: sum of matrix 1 and 2 :-- ");
        printMatrix(sum);


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

        add(a,r1,c1,b,r2,c2);
      
        sc.close();
       
    }
}
