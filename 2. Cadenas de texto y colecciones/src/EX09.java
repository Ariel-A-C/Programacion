import java.util.ArrayList;

public class EX09 {
    public static void main(String[] args) {

        ArrayList<String> aList = new ArrayList<String>();
        aList.add("First");
        aList.add("Second");
        aList.add("Third");
        aList.add("Fourth");
        aList.add("Fifth");
 
        String[] arr = new String[aList.size()];
 
        for (int i = 0; i < aList.size(); i++) {
            arr[i] = aList.get(i);
        }
    }
}