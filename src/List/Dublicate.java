package List;

import java.util.ArrayList;
import java.util.List;

class Duplicate {
    public static boolean duplicate(int array[] ){
        boolean duplicate=true;
        List<Integer> list=new ArrayList<>();
        for (Integer e:array ) {
            list.add(e);
        }
        System.out.println(list);

        if(list.size()!=list.stream().distinct().count()){

            duplicate=false;
        }
         return duplicate;
    }


    public static void main(String[] args) {

        int[] array={34,54,89,12,21,56,9};

        System.out.println(duplicate(array));
    }
}
