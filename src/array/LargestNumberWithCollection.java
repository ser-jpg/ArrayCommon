package array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestNumberWithCollection {

    public static void main(String[] args) {

       Integer myArray[]={12,45,32,17,58,98,745,45,56,87};
        System.out.println(getMaxNumber(myArray));
    }

    public static int getMaxNumber( Integer[] array){

       List<Integer> list=Arrays.asList(array);
       Collections.sort(list);
       int max= array[list.size()-1];

        return max;
}
}
