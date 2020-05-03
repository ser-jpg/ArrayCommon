package array;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter a number:");
        int number=scanner.nextInt();
        System.out.println("Please enter digit of number:");
        int digit=scanner.nextInt();

        if(findArmstrongNumber(number,digit)==number){
            System.out.println("This number is armstrong");
        }
        else{
            System.out.println("This number is not armstrong");
        }


    }
    public static int findArmstrongNumber(int number,int digit) {

        int armstrong = 0;
        while (number > 0) {
            armstrong += Math.pow(number%10,digit);

            number = number / 10;

        }

        return armstrong;


    }


}
