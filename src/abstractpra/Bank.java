package src.abstractpra;

//abstract class
abstract class Bank{
    abstract int getInterestRate();
}
//concrete class
class Barclays extends Bank{
    int getInterestRate(){return 4;}
}
//concrete class
class Santandar extends Bank{
    int getInterestRate(){return 5;}
}

class Main{
    public static void main(String args[]){
        Bank b;
        b = new Barclays ();      // concrete class object
        System.out.println("Barclays Rate of Interest is: "+b.getInterestRate()+"%");
        b = new Santandar ();        // concrete class object
        System.out.println("Santandar Rate of Interest is: "+b.getInterestRate()+"%");
    }
}