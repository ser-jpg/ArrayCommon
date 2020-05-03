package array;

import java.util.Scanner;

public class Faktoriyel {

    public static void main(String[] args) {
        while(true){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number=scanner.nextInt();
        findFactoriyal(number);
        }
    }

    public static void findFactoriyal(int number) {

        int fact = 1;
        for (int i = 2; i <= number; i++) {

            //fact =fact* i;
            fact*=i;



        }
        System.out.println(number+"! ="+fact);


    }
}
