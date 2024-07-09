import java.util.Scanner;

public class matrix_spiral_1ton2 {
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

static int[][] generateSpiralMatrix(int n )
{
int[][] matrix = new int[n][n];
{
    int topRow=0,bottomRow=n-1,leftCol=0,rightCol=n-1;
    
    int current=1;

    while(current<n*n)
    {
        //  top row --> left col to right col
        for(int j=leftCol;j<=rightCol && current<=n*n;j++)
        {
            matrix[topRow][j ]=current;
            current++ ;
        }
        topRow++;
        

        //  right col --> top row to bottom row
        for(int i=topRow;i<=bottomRow && current<=n*n;i++)
        {
           matrix[i][rightCol ]=current ;
           current++ ;
        }
        rightCol--; 
        

        //  bottom row --> right col to left col
        for(int j=rightCol;j>=leftCol && current<=n*n;j--)
        {
           matrix[bottomRow][j]=current ;
           current++ ;
        }
        bottomRow--;
    

        //  left col --> bottom row to top row
        for(int i=bottomRow;i>=topRow && current<=n*n ;i--)
        {
           matrix[i][leftCol ]=current ;
           current++ ;
        }
        leftCol++;
        

    }
    return matrix;
}
}
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.print("Enter n  : -- ");
       int n=sc.nextInt();

       int[][] matrix= generateSpiralMatrix(n);
       printMatrix(matrix);


       sc.close();




    }
}
