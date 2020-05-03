package Map;

import java.util.HashMap;
import java.util.Map;

public class addWithMap {


    public static void main(String[] args) {

        Map<String,Integer> map=new HashMap<>();

        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);
        map.put("five",5);
        System.out.println(map);
        //Printing key-value pairs
        for (Map.Entry<String,Integer> entry:map.entrySet()){

            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        HashMap<String, Integer> anotherMap = new HashMap<String, Integer>();

        //Inserting key-value pairs to anotherMap using put() method

        anotherMap.put("SIX", 6);

        anotherMap.put("SEVEN", 7);
        //Inserting key-value pairs of map to anotherMap using putAll() method
        anotherMap.putAll(map);
        //Adds key-value pair 'ONE-111' only if it is not present in map
        anotherMap.putIfAbsent("one",111);
        anotherMap.putIfAbsent("ten",10);


        for (Map.Entry<String,Integer> entry:anotherMap.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }



    }
}
