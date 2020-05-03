package array;

import java.util.Scanner;

class Palindrome {

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a word:");
            String word = scanner.nextLine();
            FindPalindrome(word);

        }
    }

    public static void FindPalindrome(String word){
        StringBuilder stringBuilder=new StringBuilder(word);
        String reverse=stringBuilder.reverse().toString();
        if(word.equalsIgnoreCase(reverse)){
            System.out.println("This word is palindrome");
        }
        else{
            System.out.println("This word is not palindrome");
        }
    }
}
