package src.collection;
import java.util.HashMap;
public class HashmapPrac {
    // Import the HashMap class
        public static void main(String[] args) {
            // Create a HashMap object called capitalCities
            HashMap<String, String> capitalCities = new HashMap<String, String>();
            HashMap<Integer,String> numbers= new HashMap< >();
            // Add numbers in value and word
            numbers.put(1,"one");
            numbers.put(2,"two");
            numbers.put(3,"three");
            numbers.put(4,"three"); // value can be repeated but key should be unique
            System.out.println(numbers);
            // Add keys and values (Country, City)
            capitalCities.put("England", "London");
            capitalCities.put("India", "Delhi");
            capitalCities.put("Scotland", "Edinburgh");
            capitalCities.put("Bangladesh", "Dhaka");
            capitalCities.put("Germany", "Clone");
            capitalCities.put("Germany", "Berlin");
            capitalCities.put("France", "Paris");
            capitalCities.put("USA", "New York");
            System.out.println(capitalCities);
            capitalCities.remove("Germany","Clone");
            capitalCities.remove("France","Paris");
            System.out.println(capitalCities.get("France"));
            System.out.println(capitalCities);
            capitalCities.replace("USA","New York" ,"Washington DC");
            System.out.println(capitalCities);
            boolean x= capitalCities.containsKey("UK");
            System.out.println(x);
            System.out.println(capitalCities.containsValue("Delhi"));
        }
    }

