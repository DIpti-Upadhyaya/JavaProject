package polymorphism;

public class Overloading2 {
    public static void  division(int a, int b) {

        int div = a / b;
        System.out.println("division of " + a + " , " + b+" =" + div);

    }
    public static void division(int a, float b, float c) {

        float div = a / b / c;
        System.out.println("division of " + a + " , " + b + "," + c+" =" + div);
    }
    public static void division(double a, double b, int c, double d) {
        double div = a-b-c-d;
        System.out.println("division of " + a + " , " + b + " , " + c + " , " + d + " = " + div);
    }

    public static void main(String[] args) {
        division(12, 4);
        division(100, 2.5f, 2);
        division(120.00, 1.20, 5, 50.02);
    }
}
