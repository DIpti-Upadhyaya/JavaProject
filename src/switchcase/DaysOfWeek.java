package swichcase;
public class DaysOfWeek {
    public static void checkWeekDay(int daynumber) {
        switch (daynumber) { // switch takes string, char & integer numbers but not for boolean//
            // switch only used for expression, not for condition//
            // we can do float and integer, but we need to cast them in int//
            // it used for multiple choices//
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("You have enter invalid day number");
        }
    }

    public static void main(String[] args) {
        checkWeekDay(3);
    }
}