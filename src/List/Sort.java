package List;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {

    public static void sort(String [] array){

        List<String> list= Arrays.asList(array);
        Collections.sort(list);
        for (String s:list) {
            System.out.println(s);
        }


    }


    public static void main(String[] args) {

        String [] array={"Serkan","Abbas","Arda","Cemil"};
        sort(array);
    }
}
