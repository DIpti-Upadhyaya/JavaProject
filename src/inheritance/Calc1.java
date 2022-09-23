package inheritance;

public class Calc1 extends Calc{
    static double a = 125;
    static double b = 7;

    public static void division() {
        double c = Calc1.a / Calc1.b;
        System.out.println(Calc1.a + " / " + b + " = " + c);
    }

    public static void module() {
        double d = Calc.a % Calc1.b;
        System.out.println("Module of " + Calc.a + " and " + Calc1.b + " = "+d);
    }

    }
