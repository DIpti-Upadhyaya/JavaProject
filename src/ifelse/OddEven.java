package ifelse;

public class OddEven {
    public static void checkNumberIsOddOrEven(int x){
        if (x%2==0){
            System.out.println(x+ " is Even number"); //pass number 1 to any  positive integer number
        }
        else
            System.out.println(x+ " is Odd number");
    }

    public static void main(String[] args) {
        checkNumberIsOddOrEven(75);
    }
}
