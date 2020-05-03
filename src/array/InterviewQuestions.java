package array;

import java.util.Arrays;
import java.util.List;

public class InterviewQuestions {
    public static void main (String [] args) {
        int[] array= new int[1000000];

        for (int i = 0; i <array.length ; i++) {

            array[i]=i;
        }
        System.out.println( check(array,102));

    }


    public static boolean check(int [] array, int k){

        for (int i = 0; i <array.length ; i++) {

            if(array[i]==k){
                return true;
            }
        }
        return false;

    }



}
