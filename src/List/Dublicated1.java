package List;

import java.sql.ClientInfoStatus;
import java.util.*;

public class Dublicated1 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,3,4,6,7,8,7,9,0,4,2));
        System.out.println(list);

        for (int i = 0; i <list.size() ; i++) {

            int count=  Collections.frequency(list,list.get(i));
            List<Integer> result=new ArrayList<>();
            if(count>1 && !result.contains(list.get(i)))

                result.add(list.get(i));
            System.out.println(result);


           // System.out.println(list.get(i)+" ="+count+" times");
        }

        }
    }