package innerClass;

public class OuterClass {

        int x = 10;

        class InnerClass {
            int y = 5;
        }


    public static class MyMainClass {
        public static void main(String[] args) {
            OuterClass myOuter = new OuterClass();
            OuterClass.InnerClass myInner = myOuter.new InnerClass();
            System.out.println(myInner.y + myOuter.x);
        }
    }

// Outputs 15 (5 + 10
}
