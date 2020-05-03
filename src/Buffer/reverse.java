package Buffer;

public class reverse {

    public static void main(String[] args) {

        String w="kara";
        /*StringBuffer stringBuffer=new StringBuffer(w);


         StringBuffer word=  stringBuffer.reverse();*/

      StringBuilder stringBuilder=new StringBuilder(w);

     StringBuilder reverse= stringBuilder.reverse();
        System.out.println(reverse);
    }
}
