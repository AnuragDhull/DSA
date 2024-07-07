import java.util.Scanner;

public class arrays2d_1 {

    static void printArray(int[][] arr)
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
     
    public static void main(String[] args) {
         
        // int[][] arr1= new int[5][5];

        int[][] arr2 = {{1,2,3},
                        {4,5,6},
                        {7,8,9}
                        };

        printArray(arr2);


        Scanner sc= new Scanner(System.in);
        System.out.print("Enter row numbers : -- ");
        int r= sc.nextInt();
        System.out.print("Enter column numbers : -- ");
        int c= sc.nextInt();
        System.out.println(" :-- Enter " + r*c + "Elements :-- "  );

        int [][] arr= new int[r][c];

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }

        System.out.println(" ---: your array is :--- ");
        printArray(arr);


        sc.close();



         
    }
}
