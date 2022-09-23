package user_method;

public class VoidMethod {
    public  void add() {
        int a = 5;
        int b = 7;
        int c = a + b;
        System.out.println(c);
    }

    public static int multy() {
        int a = 5;
        int b = 7;
        int c = a * b;
        return c;
    }

    public static String printMyName() {
        String myName = "Dipti";
        return myName;
    }

    public static boolean answerType() {
        boolean b = true;
        return b;
    }

    public static void printHouseName(String myHouseName) {
        System.out.println(myHouseName);
    }

    public static void addTwoNumber(int num1, int num2){
        int c= num1+num2;
        System.out.println(c);
    }

    public static void subtractTwoNumber(int num1, int num2) {
        int c = num1 - num2;
        System.out.println(c);
    }

    public static void main(String[] args) {
        //object creation;
       // VoidMethod obj1= new VoidMethod(add());
        //add();
        int d = multy();
        System.out.println(multy());
        //System.out.println(d);
        System.out.println(printMyName());
        System.out.println(answerType());
        printHouseName("Tulsi Dham");
        addTwoNumber(600,900);
        addTwoNumber(789,987);
        subtractTwoNumber(78,98);

    }

    public static class NonStaticMethod {
        public  void calculation(){ //non-static void method
            int a= 21;
            int b=15;
            int c=10;
            System.out.println(a-b*c);
        }

        public  double devmoduler(){ //static return method
            int x= 25;
            int y= 40;
            int z= 12;
            double p;
            p= x/y%z;
            return p;
        }
        public  static void sumOfThreeNum(int num1, int num2, int num3) //parameter method
        {
            int sum= num1+num2+num3;
            System.out.println(sum);
        }
        public  void main(String[] args) {
            calculation(); //nonstatic void output
            //System.out.println(dev()); // static return output
            sumOfThreeNum(200,245,500);
        }
    }
}
