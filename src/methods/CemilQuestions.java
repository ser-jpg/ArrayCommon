package methods;

import java.util.Scanner;

public class CemilQuestions {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter quantity of item:");
        int quantity=scanner.nextInt();

        double itemsPrice= 30;
        double totalPrize=0;

        if(quantity>100){

            totalPrize=itemsPrice*0.90*quantity;
            double discount=itemsPrice*0.10*quantity;
            System.out.println("Total discount is:$"+discount);
            System.out.println("Total Price is: $"+totalPrize);
        }
        else{
            totalPrize=itemsPrice*quantity;
            System.out.println("Total Price is $"+totalPrize);
        }
    }
}
