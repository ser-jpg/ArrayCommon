package codingBat.boolenQst;
/*
Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true
 */
public class doubleX {
   static boolean doubleX(String str) {

       int i = str.indexOf("x");
       if (i == -1) return false; // no "x" at all

       // Is char at i+1 also an "x"?
       if (i+1 >= str.length()) return false; // check i+1 in bounds?
       return str.substring(i+1, i+2).equals("x");

       // Another approach -- .startsWith() simplifies the logic
       // String x = str.substring(i);
       // return x.startsWith("xx");
    }
    public static boolean doubl( String word){
       int i =word.indexOf("x");
        System.out.println(i);
        String x = word.substring(i);
        System.out.println(x);
         return x.startsWith("xx");

    }

    public static void main(String[] args) {
        System.out.println(doubleX("axxbb"));
        System.out.println(doubleX("axaxax"));
        System.out.println(doubleX("xxxxx"));
        System.out.println(doubl("abxxcc"));
    }
}
