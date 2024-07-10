import java.util.ArrayList;
import java.util.Collections;


public class arrayList_reverse {
    static void reverseList(ArrayList<Integer> list)
    {
        int i=0,j=list.size()-1;
        

        while(i<j)
        {
            Integer temp =Integer.valueOf(list.get(i));

            list.set(i,list.get(j));
            list.set(j,temp);

            i++;
            j--;


        }

    }
    public static void main(String[] args) {
         ArrayList<Integer>  list = new ArrayList<>();

         list.add(5);
         list.add(6);
         list.add(7);
         list.add(8);

         System.out.println("Original list " + list);
         reverseList(list);
         System.out.println("reversed list :-- " + list);

         // Method 2 
         Collections.reverse(list);
         System.out.println(list);

    }
}
