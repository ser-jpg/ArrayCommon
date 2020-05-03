package array;

import org.w3c.dom.ls.LSOutput;

public class SumOfDigit {
    public static void main(String[] args) {
        int number = 245;
        int sum = 0;

        while(number > 0)
        {
            sum += number%10;  number = number/10;
            System.out.println(number);
        }

       // System.out.println(sum);
    }


}
