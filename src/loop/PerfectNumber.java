package loop;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        while (true) {
            System.out.println("Please enter a number:");
            int number = input.nextInt();

            int result = 0;
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    result = result + i;

                }
            }
            if (result == number) {
                System.out.println(number + " is perfect number");
            } else {
                System.out.println(number + " is not perfect number");
            }
        }
    }


}
