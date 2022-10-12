package src.collection;


import java.util.LinkedList;

public class LinkList {
    public static void main(String[] args) {
        LinkedList<String> colours = new LinkedList<String>();
        colours.add("Red");
        colours.add(" ");
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
        System.out.println(colours.contains("Yellow"));
        boolean x = colours.contains("Orange");
        System.out.println(x);
    }
}

