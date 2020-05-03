package loop;
/*
Question 2 ) Create a String Array and add 5 elements..
Print the elements inside of the array with using while loop.
 */
public class QuestionWithWhile {

    public static void print(String [] array){
        int i=0;
       /* while (i<array.length){

            System.out.print(array[i]);
            i++;
        };*/

       do{
           System.out.println(array[i]);
           i++;
       }while (i<array.length);



    }

    public static void main(String[] args) {

       String [] myArray={"s","e","r","k","a","n"};
        print(myArray);
    }
}
