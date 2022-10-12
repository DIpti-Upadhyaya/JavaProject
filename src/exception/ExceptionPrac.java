package src.exception;

public class ExceptionPrac extends Throwable {
        public static void main(String[ ] args) {
            int[] myNum = new int[1];
            String[] myFriends= new String[' '];
            try {
                myNum  = new int[]{1, 3, 5, 7, 9};
                myFriends= new String[] { "Swati","Nipa","Avani" };
                System.out.println(myNum[4]);
                System.out.println(myFriends[4]);
            } catch (Exception e) {
                System.out.println("Something went wrong.");
            }
           System.out.println(myFriends[2]);
        }
    }

