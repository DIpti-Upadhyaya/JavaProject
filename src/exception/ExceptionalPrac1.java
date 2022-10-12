package src.exception;

public class ExceptionalPrac1 extends Throwable {
    static int[] myNumbers = {1, 2, 3};

    public static void main(String[] args) {
        try {
            System.out.println(myNumbers[1]);
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
            try {
                System.out.println(myNumbers[5]);
            } catch (Exception e) {
                System.out.println("Something went wrong.");
            }
        System.out.println(myNumbers[2]);
        }
    }
