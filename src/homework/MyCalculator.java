package homework;

public class MyCalculator implements AdvancedArithmetic {


    @Override
    public int divisor_sum(int n) {
        int divisor_sum=0;
        int i;
        for (i = 1; i <=n ; i++) {

            if(n%i==0){

                System.out.print(i+" ");

                divisor_sum=divisor_sum+i;
            }

        }

       return divisor_sum;
    }


}
