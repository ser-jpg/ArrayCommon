package codingBat.array;
/*
Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.

middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
 */
public class middleWay {
    public static int[] middleWay(int[] a, int[] b) {

        int[] array=new int[2];
        if(a.length==3&& b.length==3){

            array[0]=a[1];
            array[1]=b[1];
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr1={1,2,3};
        int [] arr2={4,5,6};
        int [] result=middleWay(arr1,arr2);
        for (Integer e:result  ) {
            System.out.println(e);
        }
    }
}
