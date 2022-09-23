package forloop;
//sum of 1 to 50 with for loop
public class SumOf1To50 {
    public static void main(String[] args) {

        int add = 0;

        for (int i = 1; i <= 50; ++i) {
            add += i;
        }
        System.out.println("addition of 1 to 50= " + add);
    }
}
