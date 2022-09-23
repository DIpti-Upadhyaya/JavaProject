package ifelse;
// leap year is devided by 400, 4, but not by 100//
public class LeapYear {

    public static void checkLeapYear(int year)
    {
      if ((year%400==0) || (year%4==0) & (year%100!=0))
      {
          System.out.println(year + " is Leap Year");
      }
      else
          System.out.println(year + " is not Leap Year");
    }

    public static void main(String[] args) {

        checkLeapYear(1627);
        checkLeapYear(2012);
        checkLeapYear(1800);
        checkLeapYear(1998);
        checkLeapYear(2048);

    }

}
