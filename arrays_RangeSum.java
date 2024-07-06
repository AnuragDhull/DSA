import java.util.Scanner;

public class arrays_RangeSum {


    static void printArray(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            System.out.print (arr[i] + " ");

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
        
        // here we find the sum of  range of an array using 
        // prefix sum array 
        // here array is 1 based indexing

        // here we can simply do by running loop from l to r
        // but in that case time complexity is large



        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size :-- ");
        int n=sc.nextInt();
        int [] arr=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }
         

        int[] prefSum = prefixSum(arr);



        System.out.print("Enter number of quries :-- ");
        int q= sc.nextInt();


        
        while(q-- >0 )
        {
                System.out.print("--: Enter range  :-- ");
                int l= sc.nextInt();
                int r = sc.nextInt(); 

                int ans= prefSum[r]-prefSum[l-1];

                System.out.println("Ans :-- " + ans);


        }

        sc.close();

    }
}