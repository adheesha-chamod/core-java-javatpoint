public class Example2 {

    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        // byte c = a + b;      // compile time error: because a + b will be int
        byte c = (byte) (a + b);
        // default return type of arithmetic operations is int
        int d = a + b;

        System.out.println(c);  // 30
        System.out.println(d);  // 30


        int x = 12;
        byte y = 10;
        int ans1 = x + y;
        int ans2 = x - y;
        int ans3 = x * y;
        int ans4 = x / y;

        System.out.println(ans1); // 22
        System.out.println(ans2); // 2
        System.out.println(ans3); // 120
        System.out.println(ans4); // 1
    }
}
