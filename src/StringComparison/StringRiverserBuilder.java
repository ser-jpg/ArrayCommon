package StringComparison;

public class StringRiverserBuilder {
    public static void main(String[] args) {
        String name="SerkanSen";
        String reverse= new StringBuilder(name).reverse().toString();
        System.out.println(reverse);
        //other way
        String str = "Hello World";
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
    }
}
