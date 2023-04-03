import java.util.LinkedList;
public class Q2
{
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Mountains");
        ll.add("Beach");
        ll.add("Flowerfield");
        String list = ll.element();
        System.out.println(list);
        System.out.println(ll);
    }
}