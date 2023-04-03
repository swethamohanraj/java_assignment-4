import java.util.PriorityQueue;
public class Q7
{
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Bicycle");
        pq.add("Airplane");
        pq.add("Car");
        pq.add("Bike");
        System.out.println(pq);
        String qtostr = pq.toString();
        System.out.println(qtostr);
    }
}