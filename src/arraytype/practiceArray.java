package arraytype;

public class practiceArray {

    public static void main(String[] args) {
        int arr[]= {1,3,4,5,14,67,34,45};
        System.out.println( (arr[0]));
        System.out.println(arr[4]);
      String myStringarray [] = {"Dipti", "Thakor", "Rakesh", "Upadhyaya"};
      //index or address count from zero//
        // Lenght starts from 1st member//
        System.out.println(myStringarray[1]);
        System.out.println(myStringarray.length);
        for (int i=0; i< arr.length; i++) {
            System.out.println(arr[i]);
        }
        //foreach only for array
        for (int x:arr) {
            System.out.println(x);
        }
    }


}
