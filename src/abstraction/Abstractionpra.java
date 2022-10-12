package src.abstraction;

abstract class Abstractionpra {
    /*Java provides a non-access modifier “abstract”
           for implementing abstraction. This abstract modifier can be
            used with classes and methods but not variables.*/

        abstract void car();
    }
    //concrete class
    class Suzuki extends Abstractionpra{
        void car(){
            System.out.println("Suzuki::car");

        }
    }
    class Main{
        public static void main(String args[]){
            Abstractionpra obj = new Suzuki();    //Car object =>contents of Suzuki
            obj.car();          //call the method
        }
    }

