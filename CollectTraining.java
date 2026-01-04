package collections;

import java.util.*;
public class CollectTraining {
    public static void main (String[] args) {

        //List
        List<String> names = new ArrayList<>(Arrays.asList("reza","ramin","ali","hossein","leila"));
        names.add("saeid");
        names.remove("ramin");
        int size_names = names.size();
        if (names.contains("reza")) {
            IO.println("it does have " + "reza");
        }
        names.indexOf("hossein");
        names.isEmpty();

        // Set
        Set<String> fruits = new HashSet<>(Set.of("apple", "benana", "orange", "onion"));
        Set<String> ordered_fruits = new TreeSet<>(Set.of("apple", "benana", "orange", "onion" ));
        ordered_fruits.addAll(Arrays.asList( "snianf", " nfaoinsf"));

        for (int n = 0; n<names.size(); n++) {
            String samp = names.get(n); // since fruits is Set we cannot write get 
            names.set(n , samp.toLowerCase());

        }

        // Map
        Map<Integer,String> dict = new HashMap<>(Map.of(
            0,"reza",
            1, "ramin",
            2, "hossein",
            3, "ali"
        ));
        dict.put(4, "Alice");
        dict.put(4, "akbar"); // it changes Alice to akbar
        dict.get(2);
        dict.containsKey(4);
        dict.containsValue("reza");
        
        for (Map.Entry<Integer, String> pair : dict.entrySet()) {
            IO.println("name number "+ pair.getKey() + " Definition " + pair.getValue());
        }
        /* only showing KEYS */
        for (Integer word : dict.keySet()) {
            IO.println("the key word is " + word);
        }

        /* makin a Map out of two Lists */
        List<String> keys = Arrays.asList("A", "B", "C");
        List<String> values = Arrays.asList("Apple", "Banana", "Cherry");

        Map<String, String> fruitMap = new HashMap<>();

        // We loop using the size of the list
        for (int i = 0; i < keys.size(); i++) {
            fruitMap.put(keys.get(i), values.get(i));
        }

        System.out.println(fruitMap);

    }
}