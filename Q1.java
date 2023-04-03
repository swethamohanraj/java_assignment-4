import java.util.ArrayList;
public class Q1
{
    public static void main(String[] args)
    {
        ArrayList<String> al1 = new ArrayList<String>();
        al1.add("Rain");
        al1.add("Coffee");
        System.out.println("List1: "+al1);
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Heaven");
        al2.add("Moon");
        System.out.println("List2: "+al2);
        al1.addAll(al2);
        System.out.println("Joined Arraylist: "+al1);
    }
}
