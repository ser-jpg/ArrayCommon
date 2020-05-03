package codingBat.string;

public class uniqeString {

    public static boolean uniequK(String srs){

        for (int i = 0; i <srs.length()-1 ; i++) {
            if(srs.charAt(i)==srs.charAt(i+1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(uniequK("serkan"));
        System.out.println(uniequK("abbas"));
    }
}
