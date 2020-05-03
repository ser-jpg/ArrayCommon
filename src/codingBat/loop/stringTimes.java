package codingBat.loop;
/*
Given a string and a non-negative int n, return a larger string that is n copies of the original string.

stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"
 */
public class stringTimes {
    public static String stringTimes(String str, int n) {
        String word="";
        for (int i = 0; i <n ; i++) {
            word=word+str;
        }
        return word;
    }

    public static void main(String[] args) {
        System.out.println(stringTimes("Hi", 2));
        System.out.println(stringTimes("abc",3));
    }
}
