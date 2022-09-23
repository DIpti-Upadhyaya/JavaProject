package hw3variable;

public class Operators {
    public static void main(String[] args)
    {
       float a= 25.00f;
        float b=55.00f;
        int c= 20;
        float ans;
        double ans1;
        ans= a+b-c;
        System.out.println(ans); // calculation of addition and subtraction
        System.out.println(a*b/c); // calculation of multiplication & divison
       ans1= b%c; //calculation for reminder
        System.out.println(ans1);
        System.out.println(a+b+c);
        ans1= b/a;
        System.out.println(ans);
        System.out.println(a/b);
        System.out.println(c*a);
        System.out.println(b/a);
        System.out.println(a-b);
        System.out.println(ans1%ans);
    }
}
