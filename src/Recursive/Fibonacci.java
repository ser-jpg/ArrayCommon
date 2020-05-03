package Recursive;

public class Fibonacci {

    public static int findFibonacci(int n){

        if(n==1)
            return 1;

            else if(n==2)
                return 1;
            else
                return findFibonacci(n-1);
    }

    public static void main(String[] args) {

        System.out.println(findFibonacci(10));
    }
}
