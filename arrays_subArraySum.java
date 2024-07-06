import java.util.Scanner;

public class arrays_subArraySum {

    static int findArraySum(int[] arr )
    {
        int totalSum=0;
        for(int i=0;i<arr.length;i++)
        {
            totalSum+= arr[i];
        }
        return totalSum; 

    }


    static boolean equalSumPartition (int[] arr)
    {
            int totalSum=findArraySum(arr);

            int prefixSum=0; 
            for(int i=0;i<arr.length;i++)
            {
                prefixSum+=arr[i];

                int suffixSum=totalSum-prefixSum;

                if(suffixSum==prefixSum)
                {
                      return true;  
                       
                }
            }   
            return false; 
    }




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

         Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size :-- ");
        int n=sc.nextInt();
        int [] arr=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }

        System.out.println("Equal partion possible :-- " + equalSumPartition(arr));
         
    }
}

