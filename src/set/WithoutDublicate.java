package set;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class WithoutDublicate {

    public static void main(String[] args) {
        int [] myArray={1,2,5,1,3,4,6,9,8,7,6,3,5,4,14,12,3,7,};
        withoutDuplicate(myArray);
    }
    public static void withoutDuplicate(int array[]){

        Set<Integer> set=new HashSet<Integer>();
        for (int i = 0; i <array.length ; i++) {
            set.add(array[i]);

        }
        System.out.println(set);
    }


}



