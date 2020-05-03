package array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TwoMaxNumberArray {

    public static void main(String[] args) {
       // Integer[] array={23,32,34,21,67,89,86,93,58};
       // finTwoMaxNumber(array);
        int [] array={14,12,25,85,45,78,95,86};
        findTwoMaxNumber1(array);
    }

    public static void finTwoMaxNumber(Integer[] array){

        List<Integer> list= Arrays.asList(array);
        Collections.sort(list);
        System.out.println(array[list.size()-1]+" - "+array[list.size()-2]);
    }

    public static void findTwoMaxNumber1(int [] array){
       Arrays.sort(array);
        System.out.println("max1: "+ array[array.length-1]);
        System.out.println("max2: "+ array[array.length-2]);

    }
}
