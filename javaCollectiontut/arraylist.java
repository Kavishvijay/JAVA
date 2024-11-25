import java.util.ArrayList;
import java.util.Iterator;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); // Specify the generic type during instantiation
        list.add(10); // Add elements to the list
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list); // Print the list

        ArrayList<Integer> list2 = new ArrayList<>(); // Specify the generic type during instantiation
        list2.add(10); // Add elements to the list
        list2.add(20);
    
        list.addAll(list2);

        System.out.println(list);

        list.remove(Integer.valueOf(20));
       

        list.set(1, 55);
        System.out.println(list);

        //list.size()
        //traverse through iterator
        //for(Integer i : list){...}

        //iterator
        //Iterator <Integer> it = list.iterator();
        // while(it.hasnext()){
        //System.out.println(it.next);}
    




    }  
    
}
