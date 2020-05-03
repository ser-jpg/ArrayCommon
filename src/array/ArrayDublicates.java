package array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayDublicates {

    public static void main(String[] args) {
       Integer array[]={4,5,6,8,8,7,5,3,6,10,12,14};
       findDuplicate(array);
    }

    public static void findDuplicate(Integer array[]){
        List<Integer> list=Arrays.asList(array);
        Collections.sort(list);
        System.out.println(list);
        int duplicate = 0;
        for (int i = 0; i <array.length-1 ; i++) {
            if(array[i]!=array[i+1]){

                duplicate=array[i];

                System.out.println(duplicate);
            }
        }
        System.out.println(array[list.size()-1]);

    }
}
