package user_method;

public class AssignOpr {
    public static int assignOpr() {
      int a=3;
      a+=3;
      return a;
    }
    public void ageCal() {
        int age= 50;
        System.out.println("My age: "+age);
        age-=8;
        System.out.println("Eight year before my age: "+age);
        age/=2;
        System.out.println("my son's age: "+age);
    }
    public static void main(String[] args) {
        System.out.println(assignOpr());
        AssignOpr b= new AssignOpr();
        b.ageCal();
    }
        }



