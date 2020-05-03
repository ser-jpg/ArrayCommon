package array;

public class LargestNumber {

    public static void main(String[] args) {
        int [] myArray={1,2,21,134,78,90,4,5,7,99};
        System.out.println( findLargestNumber(myArray));
    }
    public static int findLargestNumber(int []array){
        int max=array[0];


        for (int i = 1; i <array.length ; i++) {
            if(max<array[i]){

                 max=array[i];
            }

        }
        return max;
    }
}
