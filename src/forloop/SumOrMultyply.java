package forloop;
// add or multiply all number fro 1 to given number using switch and for loop
import java.util.Scanner;
public class SumOrMultyply {
    static int sum() {
        System.out.print("Enter the number to do addition up to the number:- ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; ++i)
            sum += i;
        System.out.print("Addition  of 1 to "+ num + " is : ");
        return sum;
    }
    static int multyply() {
        System.out.print("Enter the number to do multiplication up to the number:- ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int mul = 0;
        for (int i = 1; i <= num; ++i)
            mul += i;
        System.out.print("Multiplication  of 1 to "+ num + " is : ");
        return mul;
    }
    public static void main(String[] args) {
        System.out.println("Enter Your Choice: 1. Addition : 2. Multiplication");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice){
        case 1:;
            System.out.println(sum() );
            break;
            case 2:;
                System.out.println(multyply() );
                break;
            default:;
                System.out.println("Please Enter Your Choice : 1 or 2");
    }
        }
    }


