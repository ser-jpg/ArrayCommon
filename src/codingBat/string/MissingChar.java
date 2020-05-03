package codingBat.string;

import java.util.ArrayList;
import java.util.List;

/*
Given a non-empty string and an int n,
return a new string where the char at index n has been removed.
 The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).

missingChar("kitten", 1) → "ktten"
missingChar("kitten", 0) → "itten"
missingChar("kitten", 4) → "kittn
 */
public class MissingChar {

    public static String missingChar(String str, int n){;
        String front = str.substring(0, n);

        System.out.println(front);
        // Start this substring at n+1 to omit the char.
        // Can also be shortened to just str.substring(n+1)
        // which goes through the end of the string.
        String back = str.substring(n+1, str.length());
        System.out.println(back);
        return front + back;


    }


    public static void main(String[] args) {

        System.out.println( missingChar("kitten",3));

    }

}
