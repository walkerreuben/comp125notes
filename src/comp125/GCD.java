package comp125;

/**
 * Created by Reuben on 23/10/2014.
 */
public class GCD {

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        int r = a%b;
        return gcd(b, r);
    }

    public static int excl(int a) {
        int r = 1;
        for (int i = a; i > 0; i--) {
            r = r * i;
        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println(gcd(463463, 38636));
        int a1 = excl(20);
        int a2 = excl(10);
        int b1 = excl(25);
        int b2 = excl(15);
        int c = gcd((a1/a2), (b1/b2));
        System.out.println(c);

    }
}
