package forloop;

public class forLoopTimetable {
    public static void timetable (int tablenumber){
        int result;
        System.out.println("my table for "+ tablenumber);
        for (int i=1; i<=10; ++i) {
            int value;
            value= tablenumber*i;
            System.out.println( tablenumber+ "X "+ i + "= "+ value);
    }
}
    public static void main(String[] args) {
        timetable(12);
    }

    }
