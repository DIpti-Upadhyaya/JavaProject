package whileloop;
//To check number is prime number with while loop
import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String[] args) {

        System.out.println("Check Number is Prime or Not:");
        System.out.print("Enter Number:- ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int b, c;
        b=2;
        c=0;
        if ((num==0) || (num==1) )
            System.out.print(num + " is not consider as prime Number or not  prime number");
while ((b<num) && (num!=0) && (num!=1) ){
                if (num % b == 0)
                    c = 1;
                b++;
}
            if ((c == 0) && (num!=0) && (num!=1) )
                System.out.print(" " +num + " is a prime Number");
            else
                System.out.print(" "+ num + " is not a prime Number");

        }
    }