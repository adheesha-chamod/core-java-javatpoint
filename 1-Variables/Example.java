/**
 * Example
 */
public class Example {

    public static void main(String[] args) {
        System.out.println("Hello! Java");

        A obj = new A();

        System.out.println(obj.a);
        System.out.println(obj.m);
        System.out.println(A.m);
        System.out.println(obj.getValue());
    }
}