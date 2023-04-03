import java.util.HashSet;
import java.util.Scanner;

public class Q5
{
    public static void main(String[] args) {
        HashSet<String> hs1=new HashSet<String>();
        HashSet<String> hs2=new HashSet<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the hashset: ");
        int n=sc.nextInt();
        System.out.println("Enter elements for set1: ");
        for(int i=0;i<n;i++){
            hs1.add(sc.next());
        }
        System.out.println("Enter elements for set2: ");
        for(int i=0;i<n;i++){
            hs2.add(sc.next());
        }
        boolean isEqual = hs1.equals(hs2);
        if (isEqual) {
            System.out.println("The two hash sets are equal.");
        } else {
            System.out.println("The two hash sets are not equal.");
        }
    }
}