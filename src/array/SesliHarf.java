package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class SesliHarf {

    public static void main(String[] args) {

        // String string = "Welcome besiktas"; //Input String
        /*System.out.println("Input String : " + string);    //Displaying Input String
        string = string.replaceAll("[AaEeIiOoUu]", "*"); //Replace vowels with star
        System.out.println(string);    //Display the word after replacement*/


        ArrayList<String> alphabets = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));

        System.out.println(alphabets);

        alphabets.replaceAll(e -> e.replace("E", "x"));
        alphabets.replaceAll(e -> e.replace("A", "x"));

        System.out.println(alphabets);
    }

}







