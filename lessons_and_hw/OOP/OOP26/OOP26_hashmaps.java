import java.util.HashMap;

public class OOP26_hashmaps {
    public static void main(String[] args){

        /*
        HashMap = A data structure that stores key-value pairs
                  Keys are unique, but values can be duplicated
                  Does not maintain any order, but memory is efficient
                  HashMap<Key, Value>
         */

        HashMap<String, Double> map = new HashMap<>();

        map.put("apple", 0.75);
        map.put("banana", 0.25);
        map.put("Porsche Panamera 4", 120.000);

        map.remove("apple");

        for(String key : map.keySet()){
            System.out.println(key + " : $" + map.get(key));
        }

    }
}
