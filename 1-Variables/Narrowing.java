public class Narrowing {

    public static void main(String[] args) {
        float f = 20.75f;
        // int a = f; // compile time error
        int a = (int) f; // narrowing -> explicit type casting

        System.out.println(f); // 20.75
        System.out.println(a); // 20
    }
}
