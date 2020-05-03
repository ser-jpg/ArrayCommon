package homework;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        MyCalculator my_calculator = new MyCalculator();

        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
       while (true){
        System.out.println("please enter number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(" Divisors sum =" + my_calculator.divisor_sum(number));

    }
    }

    static void ImplementedInterfaceNames(Object o) {

        Class[] theInterfaces = o.getClass().getInterfaces();

        for (int i = 0; i < theInterfaces.length; i++) {
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);

        }

    }
}
