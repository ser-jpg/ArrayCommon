package SwichCase;

import java.util.Scanner;

public class MaxNumberWithTernary {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter two number:");
        int number1=scanner.nextInt();
        int number2=scanner.nextInt();

        int largerValue;

        largerValue=(number1>number2)? number1 : number2;
        System.out.println(largerValue);
    }
}
