package user_method;

public class CompOpr {
    public static void compOpr(int x, int y) {
        boolean b = x == y;
        if (b == true)
            System.out.println(x + " equal to " + y);
        else {
            b = x < y;
            if (b == true)
                System.out.println(x + " is less than " + y);
            else {
                b = x > y;
                if (b == true)
                    System.out.println((x + " is grater than " + y));
            }
            System.out.println(x + " is not equal to " + y);
        }
    }

    public static void main(String[] args) {
        compOpr(136, 53);
    }
}
