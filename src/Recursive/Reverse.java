package Recursive;

public class Reverse {

    public static void main(String[] args) {
        String str = "recursive is a important function";
        String reversed = reverseString(str);
        System.out.println("The reversed is: " + reversed);
    }

    public static String reverseString(String str) {
        if (str.isEmpty())
            return str;
            //Calling Function Recursively
             return reverseString(str.substring(1)) + str.charAt(0);

    }

}
