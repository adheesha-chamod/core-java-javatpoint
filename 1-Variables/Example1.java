/**
 * A
 */

// this class can't be public class
// because this doesn't have seperate file for itself
class A {

    int a = 50; // instance variable
    static int m = 100; // static variable

    public int getValue() {
        int n = 90; // local variable
        return n;
    }
}

/**
 * Example
 */
public class Example1 {

    public static void main(String[] args) {
        System.out.println("Hello! Java");

        A obj = new A();

        System.out.println(obj.a);
        System.out.println(obj.m);
        System.out.println(A.m);
        System.out.println(obj.getValue());
    }
}