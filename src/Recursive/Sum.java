package Recursive;

public class Sum {

    public static int getSum(int n){


        if(n==1)
            return 1;
        else
            return n+getSum(n-1);

    }

    public static void main(String[] args) {
        getSum(10);
        System.out.println(getSum(10));
    }
}
