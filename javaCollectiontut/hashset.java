import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class hashset{
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(34);
        set.add(23);
        set.add(118);
        set.add(348);
        set.add(283);
        set.add(11);
        System.out.println(set); //O(1)

        // set.remove(23);
        // set.contains(34);
        // set.isEmpty();
        // set.size();
        // set.clear();
        // set.equals(set);

        //linkhashset is same as set containing properties of set as well as linkset
        //treehashset is set with sorted output set

        // TreeSet<Integer> set = new TreeSet<>();  O(log(n))
        // set.add(34);
        // set.add(23);
        // set.add(11);
        // System.out.println(set);

    }
}