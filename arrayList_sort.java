import java.util.ArrayList;
import java.util.Collections;


public class arrayList_sort {
        public static void main(String[] args) {
         ArrayList<Integer>  list = new ArrayList<>();

         list.add(5);
         list.add(6);
         list.add(7);
         list.add(8);

         System.out.println("Original list " + list);

         // in ascending oreder
         Collections.sort(list);
         System.out.println("ascending oreder" +list);

         // in descending oreder
         Collections.sort(list,Collections.reverseOrder());
         System.out.println("descending oreder " +list);

      

    }
}
