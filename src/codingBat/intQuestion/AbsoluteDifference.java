package codingBat.intQuestion;
/*
Given an int n, return the absolute difference between n and 21,
except return double the absolute difference if n is over 21.


diff21(19) → 2
diff21(10) → 11
diff21(21) → 0
 */
public class AbsoluteDifference {

    public static int diff21(int n){

        int diffrence;
       if(n<=21){
        diffrence=21-n;
        System.out.println(diffrence);
       }
       else{
           diffrence=n-21;
           System.out.println(2*diffrence);
       }
       return diffrence;
    }
    public static int diff(int x){
        return Math.abs(21-x);

    }

    public static void main(String[] args) {
        diff21(50);
        System.out.println(diff(23));
    }
}
