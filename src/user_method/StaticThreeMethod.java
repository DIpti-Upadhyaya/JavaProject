package user_method;

public class StaticThreeMethod {

    public static void multyp(){ //static void method
        int a= 5;
        int b=6;
        int c=7;
        System.out.println(a*b*c);
    }

    public static double calc(){ //static return method
        int x= 25;
        int y= 12;
        int z= 10;
        double p;
        p= x/y*z;
        return p;
    }
    public  static void sumOfThreeNum(int num1, int num2, int num3) //parameter method
    {
        int sum= num1+num2+num3;
        System.out.println(sum);
    }
    public static void main(String[] args) {
         multyp(); //static void output
        System.out.println(calc()); // static return output
        sumOfThreeNum(200,245,500);
    }
}
