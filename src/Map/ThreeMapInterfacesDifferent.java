package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ThreeMapInterfacesDifferent {
    public static void main(String[] args) {
        Map<Integer,String> hashMap=new HashMap();
        Map<Integer,String> linkedMap=new LinkedHashMap<>();
        Map<Integer,String> treeMap=new TreeMap<>();
        mapYazdir(hashMap);  // rasgele sirasiz bastirilir
        System.out.println("*****************************");
        mapYazdir(linkedMap);// giris sirasina gore bastirir
        System.out.println("********************************");
        mapYazdir(treeMap);// key e gore siralar

    }

    public static void mapYazdir(Map<Integer,String> map){

        map.put(5,"C++");
        map.put(10,"Java");
        map.put(1,"Python");
        map.put(25,"Java Script");
        map.put(95,"Ruby");

        for (Map.Entry <Integer,String> entry:map.entrySet() ) {
            System.out.println("Keys: "+entry.getKey()+" Value:"+ entry.getValue());
        }



    }
}
