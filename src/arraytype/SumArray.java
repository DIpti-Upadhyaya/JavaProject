package arraytype;
//sum of arrays's elements: addition of odd number upto 20
public class SumArray {

    public static void main(String[] args) {
        int n[]= {1,3,5,7,9,11,13,15,17,19};
        int sum=0;
        for (int i=0; i<n.length;i++) {
            sum += n[i];
        }
        System.out.println("Addition of Array:" + sum);
    }
}
