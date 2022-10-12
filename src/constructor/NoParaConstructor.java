package src.constructor;

public class NoParaConstructor {
    int i;

    // constructor with no parameter
    private NoParaConstructor() {
        i = 35;
        System.out.println("Constructor is called");
    }

    public static void main(String[] args) {

        // calling the constructor without any parameter
        NoParaConstructor obj = new NoParaConstructor();
        System.out.println("Value of i: " + obj.i);
    }
}


