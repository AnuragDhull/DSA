import java.util.Scanner;

public class arrays_tagetSum_triplet {
    public static void main(String[] args) {
        //   Triplets  //


        int [] arr={1,2,3,4,5,6,1,2,2,0,2};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter target :-- ");
        int target=sc.nextInt();
        int ans=0;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                for(int k=j+1;k<arr.length;k++)
                {
                    if(arr[i]+arr[j]+arr[k]==target)
                    {
                        ans++;
                    }
                }
            }

        }
        System.out.println("Total number of triplets :--" + ans);

        sc.close();
    }

}
