package polymorphism;

public class Overloading1 {
    public static void subtraction(int a, int b) {

        int sub = a - b;
        System.out.println("subtraction of " + a + " and " + b + " =" + sub);
    }
    public static void subtraction(int a, float b, int c) {

        float sub = a - b-c;
        System.out.println("subtraction of " + a + " , " + b + "," + c+" =" + sub);
    }
    public static void subtraction(double a, double b, int c, double d) {
        double sub = a-b-c-d;
        System.out.println("subtraction of " + a + " , " + b + " , " + c + " , " + d + " = " + sub);
    }

    public static void main(String[] args) {
        subtraction(12,5);
        subtraction(12,5.23f, 16);
        subtraction(120.23, 14.5, 35,50.23);

    }
}
