package codingBat.string;
/*
Given a string, take the last char and return a new string with the last char added at the front and back,
 so "cat" yields "tcatt".
 The original string will be length 1 or more.

backAround("cat") → "tcatt"
backAround("Hello") → "oHelloo"
backAround("a") → "aaa"
 */
public class BackAround {
public static String backAround(String str){
String result1=" ";
String result2=" ";
    for (int i = 0; i <str.length() ; i++) {


        result1=str+str.charAt(str.length()-1);
        result2=str.charAt(str.length()-1)+result1;
    }
    return result2;
}
       //2 way
    public static String backAround1(String str) {
        // Get the last char
        String last = str.substring(str.length() - 1);
        System.out.println(last);
        return last + str + last;
    }

    public static void main(String[] args) {
        backAround("ata");
        System.out.println(backAround("cat"));
        System.out.println(backAround1("cat"));
    }

}
