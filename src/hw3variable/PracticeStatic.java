package hw3variable;
public class PracticeStatic {
    //default value of primitive datatype
    static byte b;
    static short s;
    static int i;
    static long l;
    static float f;
    static double d;
    static char c;
    static boolean o;
    public static void main(String[] args) {
        /* default value of byte, short, integer, long, float
            double, char, boolean
         */
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(o);
        b=12; // reassign value
        System.out.println(b);
    }
}
