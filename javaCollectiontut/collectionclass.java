
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class collectionclass{

    public static void main(String args[]){

    // List <Integer> arr = new ArrayList<>();

    // arr.add(2);
    // arr.add(4);

        //System.out.println(Collections.max(arr));
        //.min(arr)
        //.frequency(arr, 2);
        //.sort(arr)
        //.sort(arr, comperator.reverseorder())


        List<Integer> list = Arrays.asList(2,3,4,5,6,7,8);
        Stream<Integer> data = list.stream();    //.filter(n-> con) for gving some filter values to the further process
        data.map(n->n*2)                        //.sorted() for sortnig purpose
        .forEach(n->System.out.println(n));    //.reduce(0, (c,e) ->c+e)


        //list.forEach(n ->System.out.println(n*n));

    }
}