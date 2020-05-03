package codingBat.intQuestion;

import java.util.Scanner;

public class findMiddleNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter three number:");
       int number1= scanner.nextInt();
       int number2=scanner.nextInt();
       int number3=scanner.nextInt();



       if(number1<number2 && number2<number3) {

           System.out.println("middle value is:"+number2);
       }
       else if(number2<number1&& number1<number3){
           System.out.println("middle value is:"+number1);
       }

       else if(number3<number2&& number2<number1){
           System.out.println("middle value is:"+number2);
       }
       else if(number1<number2&&number1>number3){
           System.out.println("middle value is:"+number1);
       }
       else if(number2<number1&& number2<number3){
           System.out.println("middle value is:"+number3);
       }
       else if(number1<number2&& number3<number2){
           System.out.println("middle value is:"+number3);
       }


    }
}
