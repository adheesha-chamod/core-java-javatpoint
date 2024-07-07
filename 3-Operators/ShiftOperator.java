public class ShiftOperator {

    public static void main(String[] args) {
        // left shift operator -> 
        /*
         The left shift operator (<<) in Java is used to shift the bits of a number to
         the left by a specified number of positions. It is a binary operator, used
         with two operands. The left operand is the value to be shifted, and the right
         operand specifies the number of positions to shift. This operation
         effectively multiplies the left operand by 2 raised to the power of the right
         operand.
         */
        System.out.println(10 << 1);    // 10 * 2^1 = 20
        System.out.println(10 << 2);    // 10 * 2^2 = 40
        System.out.println(20 << 3);    // 20 * 2^3 = 160
        System.out.println(20 << 4);    // 20 * 2^4 = 320


        // right shift operator
        /*
         The right shift operator (>>) in Java is used to shift the bits of a number
         to the right by a specified number of positions. It is a binary operator,
         used with two operands. The left operand is the value to be shifted, and the
         right operand specifies the number of positions to shift. This operation
         effectively divides the left operand by 2 raised to the power of the right
         operand, for positive numbers.
         */
        System.out.println(10 >> 1);    // 10 / 2^1 = 5
        System.out.println(10 >> 2);    // 10 / 2^2 = 2
        System.out.println(20 >> 3);    // 20 / 2^3 = 2
        System.out.println(20 >> 4);    // 20 / 2^4 = 1


        // for positive number, >> and >>> works same
        System.out.println(20 >> 3);    // 20 / 2^3 = 2
        System.out.println(20 >>> 3);   // 20 / 2^3 = 2

        // for negative number, >>> changes parity bit (MSB) to 0
        System.out.println(-20 >> 3);   // -20 / 2^3 = -3
        System.out.println(-20 >>> 3);  // 536870909
    }
}
