import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        
        // they are most likely arrays but variable size


        ArrayList<Integer>  l1 = new ArrayList<>();

        // ArrayList<Boolean>  l2 = new ArrayList<>();
        // ArrayList<Float>  l3 = new ArrayList<>();




        ///////// ARRAYS METHOD /////////

        // add new element 
        l1.add(5);
        l1.add(6);
        l1.add(7);

        // get elemt at index i 
        System.out.println(l1.get(0));
        System.out.println(l1.get(1));
        System.out.println(l1.get(2));

        // print with loop
        for(int i=0;i<l1.size();i++)
        {
            System.out.println(l1.get(i));
        }

        // print list directly
        System.out.println(l1);
         
        // add elemet at index i 
        l1.add(2, 9);

        // modify elemet at index i 
        l1.set(3,10);

        // remove elemet at index i 
        l1.remove(1);

        // reomve element e 
        l1.remove(Integer.valueOf(3));

        // check if element exits or not 
        boolean ans=l1.contains(Integer.valueOf(60));
        System.out.println(ans);


        // if u dont specify class ,u can put anything inside l 
        //  ArrayList l= new ArrayList();
        //  l.add("Anurag");
        //  l.add(1);
        //  l.add(true);
      
         

         
         

         

          
         
    }
}
