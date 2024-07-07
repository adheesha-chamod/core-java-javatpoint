public class Widening {

    public static void main(String[] args) {
        int a = 10;
        float f = a; // widening -> implicit type casting

        System.out.println(a); // 10
        System.out.println(f); // 10.0
    }
}
