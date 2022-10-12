package src.interfacepra;

 class Year10 implements Year {
    public void mainSubject() {
        // The body of mainSubject() is provided here
        System.out.println("Maths, Science, English");
    }
    public void subSubjects() {
        // The body of subSubjects() is provided here
        System.out.println("Gujarati, Social Studies, Computer");
    }

     @Override
     public void mainSubjects() {

     }

     @Override
     public void subSubject() {

     }
 }
    class Main {
        public static void main(String[] args) {
            Year10 mySub = new Year10();  // Create a Pig object
            mySub.mainSubject();
            mySub.subSubjects();
        }
    }
