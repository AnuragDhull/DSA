import java.util.Scanner;

public class matrix_transpose {

    static void printMatrix(int[][] arr)
    {
            for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<arr[i].length;j++)
                {
                        System.out.print(arr[i][j] + " ");
                }
                System.out.println( );
            } 
    }

    static int[][] findTranspose(int[][] matrix,int r,int c)
    {
        int[][] ans = new int[c][r];
        for(int i=0;i<c;i++)
        {
            for (int j=0;j<r;j++)
            {
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }   
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter row numbers : -- ");
        int r= sc.nextInt();
        System.out.print("Enter column numbers : -- ");
        int c= sc.nextInt();
        System.out.println(" :-- Enter " + r*c + "Elements :-- "  );

        int [][] matrix= new int[r][c];

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                matrix[i][j]= sc.nextInt();
            }
        }

        System.out.println(":-- Original Matrix :-- ");
        printMatrix (matrix);

        int[][] ans= findTranspose(matrix,r,c);

        System.out.println(":-- Transpose of a Matrix :-- ");
        printMatrix(ans);

        sc.close();

    }
}
