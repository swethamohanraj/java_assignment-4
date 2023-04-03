import java.util.*;
public class Q10 {
    public static void main(String args[]) {
        TreeMap <Integer, String> tm1 = new TreeMap<>();
        tm1.put(1,"Face");
        tm1.put(2,"Indigo");
        tm1.put(3,"Astronaut");
        tm1.put(4,"Jack in the box");
        System.out.println("Original TreeMap: " + tm1);
        System.out.println("Keys greater than or equal to 2: " + tm1.ceilingEntry(2));
        System.out.println("Keys greater than or equal to 1: " + tm1.ceilingEntry(1));
        System.out.println("Keys greater than or equal to 8: " + tm1.ceilingEntry(8));
    }
}