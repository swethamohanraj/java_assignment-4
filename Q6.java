import java.util.TreeSet;
public class Q6
{
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Mountains");
        ts.add("Beach");
        ts.add("Flowerfield");
        System.out.println("Original Treeset: "+ts);
        String last=ts.pollLast();
        ts.remove(last);
        System.out.println("Removed Treeset"+ts);
    }
}