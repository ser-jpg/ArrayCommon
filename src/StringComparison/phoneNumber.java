package StringComparison;

import java.util.Scanner;
import java.util.regex.Pattern;

public class phoneNumber {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter an three digit area code:");
            String areaCode = scanner.nextLine();

            if (areaCode.length() == 3) {

                System.out.println("Please enter 7 digit local number: ");
                String localNumber = scanner.nextLine();
                if (localNumber.length() == 7) {

                   // String result = "(" + areaCode + ")" + localNumber;
                    //System.out.println(result);
                    String result=areaCode+localNumber;
                    System.out.println(result.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3"));

                    }
                else {
                    System.out.println("You entered invalid number..Please enter 7 digit number:");
                }

            } else {
                System.out.println("You entered invalid number..Please enter 3 digit number: ");

            }
        }
    }


    /*String input = "1234567890";

    String number = input.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");

        System.out.println(number);*/


}
