package whileloop;
//palindrome number do while loop
import java.util.Scanner;
public class PalindromeNum {
    public static void main(String[] args) {
        System.out.println("Check Number is Palindrome Number:");
        System.out.print("Enter Number:- ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
    int r,d,c;
    r=0;
    c=num;
    do {
        d = num % 10;
        r = r * 10 + d;
        num = num / 10;
    }
    while(num!=0);
    if(r==c)
        System.out.println("The number " +c + " is a palindrome");
    else
        System.out.println("The number " +c + " is not a palindrome");
    }

}
