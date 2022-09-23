package ifelse;

public class PassFail {
    public static void checkStudentPassOrFail(int marks){
      if (marks>=35 && marks<=50) {
          System.out.println("student is pass "+marks);
      } else if (marks>=51 && marks<=65) {
          System.out.println("student is pass with First class "+marks);

      } else if (marks>=66 && marks<=75) {
          System.out.println("student is pass with distiction "+marks);

      } else if (marks>=76 && marks<=100) {
          System.out.println("student is pass with upper distiction "+marks);
      }
      else
          System.out.println("student is Fail "+marks);
    }

    public static void main(String[] args) {
        checkStudentPassOrFail(67);
    }
}
