package methods;
/*
1) Write a Java method to compute the average of three numbers.

2) Write a Java method to find the smallest number among three numbers.

3) Write a Java method to display the middle character of a string.
Note: a) If the length of the string is odd there will be two middle
characters.
b) If the length of the string is even there will be one middle character.


 */
public class homeWork7 {

    static int average(int number1,int number2){

        int average=(number1+number2)/2;
        return average;
    }

      static int findSmallestNumber(int [] array){

         int temp=array[0];
        for (int i = 0; i <array.length ; i++) {
           if(temp>array[i]){

               temp=array[i];

           }
        }
        return temp;
    }
    static void findMiddle(String word){
        int size=word.length();
        char middle;
        if(size%2==0){


            System.out.print(word.charAt(size/2-1));
            System.out.println(word.charAt(size/2));
        }
        else{

            System.out.println(word.charAt(size/2));
        }


    }

    public static void main(String[] args) {

         int myArray[] ={12,35,9};
         findSmallestNumber(myArray);
        System.out.println("SmallestNumber="+findSmallestNumber(myArray));
        average(10,20);
        System.out.println("Average="+average(10,20));
        findMiddle("cemil");
    }


}
