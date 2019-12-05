package array;
/*
Write a Java method to find common elements given 2 arrays Sample Arrays :
{1,2,3,4,5,6,7,8,9} {5,7,12,4,55,67,99}
Output: 5 7 4
 */

public class ArrayCommon {

    public static void main(String[] args) {

        int array1[]={1,2,3,4,5,6,7,8,9};
        int array2[]={5,7,12,4,55,67,99};

        for (int i = 0; i <array1.length ; i++) {

            for (int j = 0; j <array2.length ; j++) {

                if(array1[i]==array2[j]){

                    System.out.println(array1[i]);
                }

            }


        }


    }
}
