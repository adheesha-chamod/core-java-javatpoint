public class Overflow {

    public static void main(String[] args) {
        int a = 1000;
        byte b = (byte) a;

        System.out.println(a); // 1000
        System.out.println(b); // -24

        System.out.println(Byte.MAX_VALUE); // 127
        System.out.println(Byte.MIN_VALUE); // -128

        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Integer.MIN_VALUE); // -2147483648
    }
}
