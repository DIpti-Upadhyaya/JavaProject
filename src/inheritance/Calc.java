package inheritance;

public class Calc {
    static int a=10;
    static String b;

    public static void add(){
        int b=15;
        int add;
        add= a+b;
        System.out.println("Addition of "+ a + " and "+ b+ " = "+ add);;
    }

    public void multy(int c, int a) {
        int mult;
        mult = a * c;
        System.out.println("multiplication of " + c + " and " + a + " =" + mult);

    }
}
