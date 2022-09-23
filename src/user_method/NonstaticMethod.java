package user_method;

public class NonstaticMethod {
    public void calculation() { //static void method
        int a = 20;
        int b = 10;
        int c = 12;
        System.out.println(a * b / c);
    }

    public double division() { //non-static return method
        int x = 25;
        int y = 12;
        int z = 10;
        double p;
        p = x / y / z;
        return p;
    }

    public void sumThreeNum(int num1, int num2, int num3) //parameter non static method
    {
        int sum = num1 + num2 + num3;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        NonstaticMethod a = new NonstaticMethod(); // a is an object
        a.calculation();

        a.division();
        System.out.println(a.division());

        a.sumThreeNum(345, 556, 789);
        // new NonstaticMethod().calculation(); second method to create object

    }
}


