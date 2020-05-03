package array;

public class ReverseNumber {

    public static void main(String[] args) {

        reverseNumber(12548);
    }

    public static void reverseNumber(int number){
       int reverse = 0;
        while(number>0){

             reverse= number%10;

            System.out.print(reverse);
             number=number/10;

        }

    }
}
