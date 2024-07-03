public class arrays_rotate {
    public static void main(String[] args) {

        // Rotating array by unit k units 

        
        int[] arr = {1, 2, 3, 4, 5, 6};

        int n=arr.length;

        int[] ans =new int[n];

        int k=3;  // rotate array by unit 3

        k=k%n;

        int j=0;

        for(int i=n-k;i<n;i++)
        {                           // 2nd half 
            ans[j++] =arr[i];

        }

        for(int i=0;i<n-k;i++)
        {                           // 1st half
            ans[j++]=arr[i];        
        }


        for(int x=0;x<arr.length;x++)
        {
                System.out.print(ans[x]);
        }

    }
}
