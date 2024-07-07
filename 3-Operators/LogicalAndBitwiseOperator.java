public class LogicalAndBitwiseOperator {
    
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 20;

        System.out.println(a < b && a < c);     // false && true = false
        System.out.println(a < b & a < c);      // false & true = false

        // Logical AND vs Bitwise AND
        System.out.println(a < b && a++ < c);   // false && true = false
        System.out.println(a);                  // 10 because second condition is not checked
        System.out.println(a < b & a++ < c);    // false && true = false
        System.out.println(a);                  // 11 because second condition is checked


        a = 10;
        b = 5;
        c = 20;

        System.out.println(a < b || a < c);     // false || true = true
        System.out.println(a < b | a < c);      // false | true = true

        // Logical OR vs Bitwise OR
        System.out.println(a > b || a++ < c);   // true || true = true
        System.out.println(a);                  // 10 because second condition is not checked
        System.out.println(a > b | a++ < c);    // true | true = true
        System.out.println(a);                  // 11 because second condition is checked
    }
}
