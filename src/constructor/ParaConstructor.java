package src.constructor;

public class ParaConstructor {
    String myspokenlang;

    // constructor accepting single value
    ParaConstructor(String lang) {
        myspokenlang = lang;
        System.out.println( " I can speak " + lang);
    }

    public static void main(String[] args) {

        // call constructor by passing a single value
        ParaConstructor obj1 = new ParaConstructor("Gujarati");
        ParaConstructor obj2 = new ParaConstructor("Hindi");
        ParaConstructor obj3 = new ParaConstructor("English");
    }
}
