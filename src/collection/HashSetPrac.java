package src.collection;
import java.util.HashSet;
public class HashSetPrac {

        public static void main(String[] args) {

            // Create a HashSet object called numbers
            HashSet<Integer> numbers = new HashSet<Integer>();

            // Add values to the set
            numbers.add(4);
            numbers.add(4);
            numbers.add(9);
            numbers.add(7);
            numbers.add(8);
            numbers.add(10);
            numbers.add(11);
            System.out.println(numbers);
            // Show which numbers between 1 and 10 are in the set
            for(int i = 1; i <= 10; i++) {
                if(numbers.contains(i)) {
                    System.out.println(i + " was found in the set.");
                } else {
                    System.out.println(i + " was not found in the set.");
                }
            }
        }
    }
