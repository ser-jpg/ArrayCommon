package set;

import java.util.Set;
import java.util.TreeSet;

public class Sort {

    public static void sort( ){

        Set<Integer> set=new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(35);
        set.add(23);

        System.out.println(set);

    }

    public static void sort2(int [] array){

        Set<Integer> set=new TreeSet<>();

        for (Integer e: array) {
            set.add(e);

        }
        System.out.println(set);
    }




    public static void main(String[] args) {
        sort();

        int[] array={34,54,89,12,21,56,9};

        sort2(array);
    }
}
