public class UnaryOperator {

    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++);    // 10 (11)
        System.out.println(++a);    // 12
        System.out.println(a--);    // 12 (11)
        System.out.println(--a);    // 10


        int p = 10;
        int q = 10;
        System.out.println(p++ + ++p);  // 10 + 12 = 22
        System.out.println(q++ + q++);  // 10 + 11 = 21


        int m = 10;
        int n = -10;
        boolean j = true;
        boolean k = false;
        System.out.println(~m); // -11 (minus of total positive value which starts from 0)
        System.out.println(~n); // 9 (positive of total minus, positive starts from 0)
        System.out.println(!j); // false
        System.out.println(!k); // true
    }
}
