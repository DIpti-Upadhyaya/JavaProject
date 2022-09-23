package forloop;

public class ForLoopfromto {
    public static void countEvenNumber (int from, int to) {
        System.out.print ("Even number Between " + from+ " to "
                +  to + " : " );
        for (int i=from; i<=to; i++){
            if (i%2==0)
            System.out.print (i+ ":");
        }
    }
    public static void main(String[] args) {
      countEvenNumber(6,15);
    }
        }