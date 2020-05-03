package codingBat.string;
/*
Given a string, if the string "del" appears starting at index 1,
return a string where that "del" has been deleted. Otherwise, return the string unchanged.

delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"
 */
public class delDel {
    public static String delDel(String str) {
      if(str.contains("del")){
          int index=str.indexOf("del");
          System.out.println(index);
          String word=str.substring(0,index)+str.substring(index+3,str.length());
          return word;
      }
      return str;
    }

    public static void main(String[] args) {
        System.out.println(delDel("adelbc"));
        System.out.println(delDel("badelHello"));
        System.out.println(delDel("adedbc"));
        System.out.println(delDel("delsa"));
    }
}
