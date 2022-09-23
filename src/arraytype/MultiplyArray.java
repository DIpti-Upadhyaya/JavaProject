package arraytype;
//Multiplication of arrays elements: multiplication of even number up to 15
public class MultiplyArray {
    static int multiply() {
        int n[] = {2, 4, 6,8,10,12,14};
        int mul = 1;
        for (int i = 0; i < n.length; ++i) {
            mul = mul * n[i];
            System.out.print( n[i] +"-" );
        }
        System.out.print(":");
        return mul;
    }

    public static void main(String[] args) {
        System.out.println("Multiplication of numbers "  + multiply());
    }
}
