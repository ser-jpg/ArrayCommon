package codingBat.intQuestion;
/*
Given three int values, a b c, return the largest.

intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3
 */
public class intMax {
    public static int intMax(int a, int b, int c) {
        int max;

        // First check between a and b
        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        // Now check between max and c
        if (c > max) {
            max = c;
        }

        return max;

        // Could use the built in Math.max(x, y) function which selects the larger
        // of two values.
    }
    public static int findMax(int a, int b,int c){

        int max= Math.max(a,b);
        int sMax=Math.max(max,c);
        return sMax;
    }

    public static void main(String[] args) {
        System.out.println(findMax(3,7,1));
        System.out.println(intMax(3,7,1));
    }


}
