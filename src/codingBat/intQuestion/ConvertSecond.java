package codingBat.intQuestion;

import java.util.Scanner;

public class ConvertSecond {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter second number:");

            int second = scanner.nextInt();

            int hours = second / 3600;
            int minute = (second % 3600)/60;
            int second1 = (second % 3600) % 60;

            System.out.println(hours+" hours "+minute+" minutes "+second1+" seconds");


        }
    }
}
