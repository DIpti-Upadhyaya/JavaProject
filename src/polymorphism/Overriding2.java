package polymorphism;

public class Overriding2 extends Overriding1{
    static int a=20;
    static String b;

    public static void add(){
        int b=45;
        int add;
        add= a+b;
        System.out.println("Addition of "+ a + " and "+ b+ " = "+ add);
    }
    public static void multy(int c, int a) {
        int mult;
        mult = a * c;
        System.out.println("multiplication of " + c + " and " + a + " =" + mult);
    }
    public static void main(String[] args) {
        add();
        division(25,5);
        multy(5,20);

    }


    }
