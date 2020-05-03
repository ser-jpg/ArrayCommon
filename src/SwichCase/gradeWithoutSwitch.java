package SwichCase;

import java.util.Scanner;

public class gradeWithoutSwitch {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a score:");
        String grade="";
        int score=scanner.nextInt();
        if(score>0&& score<=100){

            grade= (score>=90) ? "A" :(score>=80) ? "B" :(score>=70)? "C" :(score>=60) ? "D" :"F";

        }
        else{

            grade="invalid";
        }

        System.out.println(grade);

    }
}
