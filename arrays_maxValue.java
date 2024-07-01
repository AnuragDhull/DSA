public class arrays_maxValue {
    public static void main(String[] args) {
        int[] marks={-10,20,30,40,50};

        int max=0;
        for(int i=0;i<marks.length;i++)
        {
           if(marks[i]>max)
           {
            max=marks[i];
           }
        }
        System.out.println(max);
    }
}
