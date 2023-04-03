import java.util.HashSet;
public class Q4
{
    public static void main(String[] args) {
        HashSet<String> hs1 = new HashSet<String>();
        hs1.add("Monday");
        hs1.add("Tuesday");
        hs1.add("Wednesday");
        System.out.println("Original hashset: "+hs1);
        hs1.clear();
        System.out.println("Removed hashset: "+hs1);
    }
}