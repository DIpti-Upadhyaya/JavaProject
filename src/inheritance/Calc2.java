package inheritance;

import java.util.Scanner;

public class Calc2 extends Calc1{
    static String a= "Grater than ";
    static String b= "Less than ";
    static String c= "Equal to ";

    public static void comparison(){

        if (Calc.a<Calc1.b) {
            System.out.println(Calc.a+ " is "+ Calc2.b + Calc1.b);
        } else if (Calc.a>Calc1.b) {
            System.out.println(Calc.a+ " is " +Calc2.a + Calc1.b);
        }
        else
            System.out.println(Calc.a+ " is " +Calc2.c + Calc1.b);
    }

    public static void age(){
        System.out.println("Enter the age: ");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if (age<13) {;
            System.out.println("Person is a child");
        } else if (age>=13 && age<18) {
            System.out.println("Person is a teenager");
        }
        else
            System.out.println("person is an adult");

    }
    }


