class Array_1d{
    void demoArrays()
    {
        int[] ages;
        ages=new int[5];
        String [] name=new String[5];
        float [] weight=new float[5];

       

        ages[0]=10;
        ages[1]=20;
        ages[2]=30;
        name[0]="Anurag";
        name[1]="Dhull";
        name[2]="jaat";
        weight[0]=10;
        weight[1]=20;
        weight[2]=30;

        System.out.println(ages[0]);
        System.out.println(name[0]);
        System.out.println(weight[0]);

        System.out.println(name.length);
        System.out.println(ages.length);
        System.out.println(weight.length);

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");


        // Printing 1d array using loops 

        for(int i=0;i<3;i++)
        {
            System.out.println(name[i]);
        }

        for(int j:ages)
        {
            System.out.println(j);
        }

        int k=0;
        while(k<3)
        {
            System.out.println(k);
            k++;
        }

       
    }

}

class Array_2d{
    void demoArrays()
    {
        int[][] marks=new int[2][2];

        marks[0][0]=1;
        marks[0][1]=2;
        marks[1][0]=3;
        marks[1][1]=4;

        System.out.println(marks[0][0]);
        System.out.println(marks[0][1]);
        System.out.println(marks[1][0]);
        System.out.println(marks[1][1]);

        System.out.println(marks.length);


        // Printing 2d array

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println(marks[i][j]);
            }
        }

        for(int i=0;i<marks.length;i++)
        {
            for(int j=0;j<marks[i].length;j++)
            {
                System.out.println(marks[i][j]);
            }
        } 

    }
}
public class arrays_1 {
    public static void main(String[] args) {
        Array_1d obj1=new Array_1d();
        obj1.demoArrays();

        Array_2d obj2=new Array_2d();
        obj2.demoArrays();
    }
}