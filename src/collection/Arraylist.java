package src.collection;

import java.util.ArrayList;

public class Arraylist {
        public static void main(String[] args) {
            ArrayList<String> colours = new ArrayList<String>();
            colours.add("Red");
           colours.add("orange");
            colours.add("Yellow");
            colours.add("Green");
            colours.add("Blue");
            System.out.println(colours);
            colours.remove("Yellow");
            System.out.println(colours);
            colours.remove(2);
            System.out.println(colours);
            colours.add("Violate");
            System.out.println(colours.get(3));
            System.out.println(colours);
            colours.set(3,"Yellow");
            System.out.println(colours);

        }
    }

