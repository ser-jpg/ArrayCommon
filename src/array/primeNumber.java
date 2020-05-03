package array;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
     while(true){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number=scanner.nextInt();
        System.out.println(findPrimeNumber(number));
     }

    }

    public static boolean findPrimeNumber(int number){

        if(number<=1){
            return false;
        }

        for (int i = 2; i < Math.sqrt(number); i++) {

            if (number%i==0){
                  return false;
            }

        }
        return true;
    }
}
