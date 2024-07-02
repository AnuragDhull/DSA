public class arrays_1stRepeat {
    public static void main(String[] args) {
        

        // First elemt repeat // 
        int [] arr={1,2,3,4,5,6,1,2,2,0,2};

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    arr[i];
                    break;
                }
            }
        }
    }
}
