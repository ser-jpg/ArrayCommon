package codingBat.intQuestion;
/*
Given 2 int values, return true if either of them is in the range 10..20 inclusive.

in1020(12, 99) → true
in1020(21, 12) → true
in1020(8, 99) → false
 */
public class in1020 {
    public boolean in1020(int a, int b) {
    if(!((a>=10 && a<=20)||b>=10&& b<=20)){
        return false;
    }
    return true;
    }
    //2.way
    public boolean in10201(int a, int b) {
        return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
    }
}
