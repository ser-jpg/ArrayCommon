package codingBat.intQuestion;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Overdose {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter number of milligrams in drink:");

        int milligrams=scanner.nextInt();

        int overDose=10*1000/milligrams;

        System.out.println(overDose);
    }


}
