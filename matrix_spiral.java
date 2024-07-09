import java.util.Scanner;

public class matrix_spiral {
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
static void printSpiralOrder(int[][] matrix,int r ,int c)
{
    int topRow=0,bottomRow=r-1,leftCol=0,rightCol=c-1;
    int totalElement=0;

    while(totalElement<r*c)
    {
        //  top row --> left col to right col
        for(int j=leftCol;j<=rightCol;j++)
        {
            System.out.println(matrix[topRow][j ] + " ");
        }
        topRow++;
        totalElement++;

        //  right col --> top row to bottom row
        for(int i=topRow;i<=bottomRow;i++)
        {
            System.out.println(matrix[i][rightCol ] + " ");
        }
        rightCol--; 
        totalElement++;

        //  bottom row --> right col to left col
        for(int j=rightCol;j>=leftCol;j++)
        {
            System.out.println(matrix[bottomRow][j] + " ");
        }
        bottomRow--;
        totalElement++;

        //  left col --> bottom row to top row
        for(int i=bottomRow;i>=topRow;i++)
        {
            System.out.println(matrix[i][leftCol ] + " " );
        }
        leftCol++;
        totalElement++;

    }
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

        System.out.println( "--: Original matrix :-- ");
        printMatrix(matrix);

        System.out.println("--: spiral matrix :--");
        printSpiralOrder(matrix, r, c);

        sc.close();

    }
}
