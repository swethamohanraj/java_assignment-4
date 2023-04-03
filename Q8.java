import java.util.HashMap;
import java.util.Map;
public class Q8
{
    public static void main(String args[]){
        Map<Integer,String> m= new HashMap<Integer, String>();
        m.put(4,"Moon");
        m.put(18,"Sun");
        m.put(12,"Sky");
        System.out.println("Collection view of the values: "+ m.values());
    }
}