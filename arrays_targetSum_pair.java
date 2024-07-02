import java.util.Scanner;
public class arrays_targetSum_pair {

    //   PAIRS  //

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,1,2,2,0,2};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter target :-- ");
        int target=sc.nextInt();
        int ans=0;



        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if (arr[i]+arr[j]==target)
                {
                    ans=ans+1;

                }
            }
        }
        System.out.println("Total number of pairs" + ans);

        sc.close();
    }
}
