package swichcase;

public class ATM {
    public void selectATMChoice(int choice) {
        switch (choice) {
            case 1: ;
                System.out.println("Check Balance");
                break;
            case 2: ;
                System.out.println("withdraw Money");
                break;
            case 3:;
                System.out.println("Deposit Money");
                break;
            default:;
            System.out.println("Wrong number. Enter number from 1 to 3");
        }
    }
    public static void main(String[] args) {
        ATM a = new ATM();
        a.selectATMChoice(2);
        a.selectATMChoice(4);
        a.selectATMChoice(3);
        a.selectATMChoice(1);
    }
}
