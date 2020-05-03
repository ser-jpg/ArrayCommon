package array;

import java.util.Scanner;

public class MaxNumberTakeUsers {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter 5 number:");
            int[]myArray={scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt()};

           /* int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();
            int number3 = scanner.nextInt();
            int number4 = scanner.nextInt();
            int number5 = scanner.nextInt();
            int[] myArray = new int[5];
            myArray[0] = number1;
            myArray[1] = number2;
            myArray[2] = number3;
            myArray[3] = number4;
            myArray[4] = number5;*/

            int maxNumber = myArray[0];
            for (int i = 0; i < myArray.length; i++) {

                if (myArray[i] > maxNumber) {
                    maxNumber = myArray[i];
                } else {
                    maxNumber = myArray[0];


                }

            }
            System.out.println("Max Number:" + maxNumber);


        }

    }


}
