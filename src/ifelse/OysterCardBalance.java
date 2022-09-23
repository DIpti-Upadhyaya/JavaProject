package ifelse;

public class OysterCardBalance {

    public static void checkBalance( double balance)
    {

         float MINIMUMBALANCE=10;
        if (balance<MINIMUMBALANCE){
        System.out.println(" Insufficient balance. Please top up your oyster");
    }
        else {
            System.out.println("Gate will open");}
    }

    public static void main(String[] args) {
        checkBalance(20.00);
        checkBalance(10.00);
        checkBalance(8.00);
    }
}
