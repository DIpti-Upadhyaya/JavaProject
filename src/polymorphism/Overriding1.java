package polymorphism;

public class Overriding1 {
    static int a = 25;
    static String b;

    public static void add() {
        int b = 35;
        int add;
        add = a + b;
        System.out.println("Addition of " + a + " and " + b + " = " + add);
        ;
    }

    public static void division(int c, int a) {
        int div;
       div = c / a;
        System.out.println("division of " + c + " and " + a + " =" + div);
    }
}

