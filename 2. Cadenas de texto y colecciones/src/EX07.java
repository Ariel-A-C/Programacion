import java.util.ArrayList;
import java.util.Iterator;

public class EX07 {
    public static void main(String[] args) {
        ArrayList<String> aList = new ArrayList<String>();
        aList.add("First");
        aList.add("Second");
        aList.add("Third");
        aList.add("Fourth");
        aList.add("Fifth");

        Iterator<String> it = aList.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}