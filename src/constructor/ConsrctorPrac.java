package src.constructor;

public class ConsrctorPrac {
    /*A constructor in Java is similar to a method that is invoked when an object of the class is created.
      Unlike Java methods, a constructor has the same name as that of the class and does not have any return type.*/

    private String name;

    // constructor
    ConsrctorPrac() {
        System.out.println("Constructor Called:");
        name = "Dipti";
    }

    public static void main(String[] args) {

        // constructor is invoked while
        // creating an object of the Main class
        ConsrctorPrac obj = new ConsrctorPrac();
        System.out.println("The name is " + obj.name);
    }
}