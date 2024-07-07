/**
 * InnerExample
 */
class Sample {

    boolean bool;

    char c;

    byte b;
    short s;
    int i;
    long l;

    float f;
    double d;
}

public class Example {
    
    public static void main(String[] args) {
        Sample sample = new Sample();

        System.out.println(sample.bool);    // false
        System.out.println(sample.c);       // no character
        System.out.println(sample.b);       // 0
        System.out.println(sample.s);       // 0
        System.out.println(sample.i);       // 0
        System.out.println(sample.l);       // 0
        System.out.println(sample.f);       // 0.0
        System.out.println(sample.d);       // 0.0
    }
}
