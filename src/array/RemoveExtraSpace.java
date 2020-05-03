package array;

public class RemoveExtraSpace {
    public static void main(String[] args) {
        String input = "Try    to    remove   extra   spaces.";

        String inputNew = input;
        while (inputNew.contains("  ")){

           inputNew= inputNew.replace("  "," ");


        }
        System.out.println(inputNew);


    }
}
