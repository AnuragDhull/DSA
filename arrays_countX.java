import java.util.Scanner;
public class arrays_countX {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter elemet u like to find :--");
        int x=sc.nextInt();

        int [] arr={10,20,10,40,50};
        int count=0;

        for(int i=0;i<arr.length;i++)
        {
            if(x==arr[i])
            {
                count=count+1;
            }
            
        }
        System.out.println(count);
        
        sc.close();
    }
}