public class arrays_reverse_1 {
    public static void main(String[] args) {


        // Reversing array by making new array 
        
        int [] arr={1,2,3,4,5,6,1,2,2,0,2};
        int n=arr.length;
        int [] ans=new int[n];

        int j=0;

        for(int i=n-1;i>=0;i--)
        {
            ans[j++]=arr[i];
        }
        
        for(int k=0;k<ans.length;k++)
        {
            System.out.print(ans[k] + " ");
        }
    }
}
