import java.util.Scanner;
public class arrays_input {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number of elements in array :-- ");
        int n=sc.nextInt();

        int [] arr=new int[n];

        System.out.println("Enter elements of array ");

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();

        }
        for(int j=0;j<arr.length;j++)
        {
            System.out.print(arr[j] + " ");
        }

        sc.close();
    }
}
