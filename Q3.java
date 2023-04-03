import java.util.LinkedList;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Mountains");
        ll.add("Beach");
        ll.add("Flowerfield");
        Scanner sc=new Scanner(System.in);
        String element = sc.next();
        if(ll.contains(element))
        {
            System.out.println("The element exists");
        }
        else
        {
            System.out.println("The element does not exist");
        }
    }
}