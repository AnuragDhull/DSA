import java.util.Scanner;


public class arrays_prefixSum {


    static void printArray(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i] + " ");

        }
        System.out.println();
    }


    static int[] prefixSum(int[] arr)
    {
         int n=arr.length;
         int[] pref=new int[n];

         pref[0]=arr[0];
          for(int i=1;i<n;i++)
          {
             pref[i]=pref[i-1]+arr[i];
          }
          return pref; 

    }

    public static void main(String[] args) {
       


         Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size :-- ");
        int n=sc.nextInt();
        int [] arr=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }




        int[] pref=prefixSum(arr);
        printArray(pref);


    }
}
