public class arrays_uniqueElement {
    public static void main(String[] args) {

        // Unique Element in an Array //

        int [] arr={1,2,3,4,5,6,1,2,2,0,2};

        for(int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }

        for(int k =0;k<arr.length;k++)
        {
            if(arr[k]>0)
            {
                System.out.println("unique element is :-- " + arr[k]);
            }
        }


    }
}