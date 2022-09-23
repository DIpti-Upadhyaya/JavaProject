package stringmethod;


//import com.sun.org.apache.xpath.internal.operations.String;

import java.util.Locale;

public class StringOperations {
    public static void main(String[] args) {

        String myName = "Dipti ";
        String middleName = "Rakesh ";
        String lastName = "Upadhyaya";
        StringBuffer x = new StringBuffer(lastName);
        System.out.println("My lastName's reverse: " + x.reverse());
        int mlength = myName.length();
        int llength = lastName.length();
        int mmlength = myName.length();
        System.out.println(myName + " has " + mlength + " characters");
        System.out.println(lastName + " has " + llength + " characters");
        System.out.println(middleName + " has " + mmlength + " characters");
        System.out.println(myName + " has " + mlength + " characters");
        System.out.println(myName.toUpperCase());
        System.out.println(lastName.toLowerCase());
        System.out.println(myName.replaceAll(myName, lastName));
        System.out.println(lastName.replaceAll(lastName,myName));
        System.out.println(middleName.contains("z"));
    }
}
