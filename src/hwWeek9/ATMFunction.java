package hwWeek9;

import java.util.Scanner;
//Adding comments
public class ATMFunction {
    public static void atmFunctions() {
        double balance = 2500.00;
        System.out.println("1: Check Balance");
        System.out.println("2: Withdraw Money");
        System.out.println("3: Deposit Money");
        System.out.print("Enter your Choice of transaction:-");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();

        switch (choice) {
            case 1:
                ;
                System.out.println("Your Balance: "+ balance);
                break;
            case 2: ;
                System.out.println("Enter amount you want to withdraw:-");
                Scanner sc1=new Scanner(System.in);
                double amt = sc1.nextDouble();
                balance -= amt;
                System.out.println("Your balance after transaction:" + balance);
                break;
            case 3:;
                System.out.println("Enter amount you want to deposit");
                Scanner sc2=new Scanner(System.in);
                double amt1 = sc2.nextDouble();
                System.out.println("You withdraw Money:" + amt1);
                balance= balance + amt1;
                System.out.println("Your balance after transaction:" + balance);
                break;
            default:;
                System.out.println("Wrong number Enter number from 1 to 3");
        }

    }

    public static void main(String[] args) {

        atmFunctions();
    }
}


