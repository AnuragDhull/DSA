import java.util.Scanner;

public class arrays_lastOccurence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter elemet u like to find last occurence :--");
        int x=sc.nextInt();

        int [] arr={10,20,10,40,50,20,20,20};
        int index=-1;

        for(int i=0;i<arr.length;i++)
        {
             if(arr[i]==x)
             {
                index=i;
             }
        }
        if(index!=-1)
        {
        System.out.println(index);
        }
        else
        {
            System.out.println("element not presnt");
        }
        sc.close();
    }
}
 