package inheritance;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class Calc3 extends Calc2 {

    public static float sqr() {
        System.out.println("Enter the value");
       Scanner sc = new Scanner(System.in);
        float m = sc.nextInt();
        float sqr= m*m;
        return sqr;
    }
    public static float sqrt() {
        System.out.println("Enter the value");
        Scanner sc = new Scanner(System.in);
        float n = sc.nextInt();
        float sqrt= ((float) Math.sqrt(n));
        return sqrt;
    }

    public static void main(String[] args) {
            add();
            Calc a= new Calc();
            a.multy(5, Calc.a);
        Calc3 m= new Calc3(); Calc1.division();
        Calc.add();
        Calc1.module();
        Calc1.division();
        Calc.add();
        Calc1.module();
        comparison();
        Calc2.age();
        Calc3 n= new Calc3();
        System.out.println( "Square of the Number = "+ Calc3.sqr());
        System.out.println( "Square root of the Number = "+ Calc3.sqrt());
    }
}
