package codingBat.boolenQst;
/*
Return true if the given string contains between 1 and 3 'e' chars.

stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
 */
public class stringE {
    public static boolean stringE(String str) {
        int temp=0;
        for (int i = 0; i <str.length() ; i++) {
           char check= str.charAt(i);
           if(check=='e'){

               temp++;
           }

        }
        System.out.println(temp);
        if(temp>=1 && temp<=3)
        {
            return true;
        }
        else
            return false;
    }

    public boolean stringE1(String str) {
        int count = 0;

        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == 'e') count++;
            // alternately: str.substring(i, i+1).equals("e")
        }

        return (count >= 1 && count <= 3);
    }

    public static void main(String[] args) {
        System.out.println(stringE("Hello"));
        System.out.println(stringE("Heelle"));
        System.out.println(stringE("Heelele"));
    }
}
