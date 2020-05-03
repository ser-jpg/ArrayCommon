package codingBat.boolenQst;
/*
Given a string, return true if the string starts with "hi" and false otherwise.

startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false
 */
public class StartHi {
    public static boolean startHi(String str){



        // First test if the string is not at least length 2
        // (so the substring() below does not go past the end).
        if (str.length() < 2) return false;

            // Pull out the string of the first two chars
            String first = str.substring(0,2);

            if (first.equalsIgnoreCase("hi")) {
                return true;
            } else {
                return false;
            }

    }

    public static void main(String[] args) {
        System.out.println(startHi("hi there"));
    }
}
