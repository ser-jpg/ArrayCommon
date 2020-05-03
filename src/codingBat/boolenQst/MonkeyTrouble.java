package codingBat.boolenQst;
/*
We have two monkeys,
a and b, and the parameters aSmile and bSmile indicate if each is smiling.
We are in trouble if they are both smiling or if neither of them is smiling.
Return true if we are in trouble.

monkeyTrouble(true, true) → true
monkeyTrouble(false, false) → true
monkeyTrouble(true, false) → false

 */
public class MonkeyTrouble {
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if ((aSmile == true && bSmile == true) || (aSmile == false && bSmile == false)) {

            return true;
        }
        else return false;
    }
    // 2. way
    public static boolean monkeyTrouble1(boolean aSmile, boolean bSmile){

        return (aSmile==bSmile);
    }
 // 3.way
    public static boolean monkeyTrouble2(boolean aSmile, boolean bSmile){

        return ((aSmile && bSmile) || (!aSmile && !bSmile));
    }

    public static void main(String[] args) {
        System.out.println(monkeyTrouble(true, true));
        System.out.println(monkeyTrouble(false, false));
        System.out.println(monkeyTrouble(true, false));
        System.out.println(monkeyTrouble1(true,true));
        System.out.println(monkeyTrouble2(false,false));
        System.out.println(monkeyTrouble2(true,false));
    }


}
