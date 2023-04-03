import java.util.*;
public class Q11 {
    public static void main(String args[]) {
        TreeMap <Integer, String> tm = new TreeMap <>();
        tm.put(1,"Apple");
        tm.put(2,"Ball");
        tm.put(3,"Candy");
        tm.put(4,"Doll");
        System.out.println("Original TreeMap: " + tm);
        System.out.println("Keys greater than or equal to 1: " + tm.ceilingKey(1));
        System.out.println("Keys greater than or equal to 2: " + tm.ceilingKey(2));
        System.out.println("Keys greater than or equal to 4: " + tm.ceilingKey(4));
    }
}
