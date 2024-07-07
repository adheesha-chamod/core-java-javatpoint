public class ArithmeticOperator {
    
    public static void main(String[] args) {
        int a = 10;
        int b = 6;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);  // 1
        System.out.println(a % b);  // 4

        System.out.println(10 * 10 / 5 + 3 - 1 * 4 / 2);    // 21
        // java follows BODMAS rule
    }
}
