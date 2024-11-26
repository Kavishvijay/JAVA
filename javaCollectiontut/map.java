import java.util.HashMap;
import java.util.Map;

public class map{
    public static void main(String[] args) {

        Map<String, Integer> mp = new HashMap<>();
        mp.put("Key", 1);
        mp.put("kavish", 3);
        mp.put("flsd", 2);
        mp.put("ram", 45);
        mp.put("bun", 14);

        //System.out.println(mp);
        System.out.println(mp.get("Key"));

        if(!mp.containsKey("shyam")){
            mp.put("shyam", 78);

            System.out.println(mp);

            //mp.putIFAbsent("Key", value)
            //mp.containsKey(key)
            //mp.isEmpty()
            //mp.keySet() you can iterate this
            //mp.getOrDefault
            //mp.remove()
        }

        //Map.Entry for iteration
        for(Map.Entry(String, Integer) e : number.entrySet()){
            System.out.println(e);

            e.getKey();
            e.getValue();


        }
        //TreeMap is same but sorted

    }
}
