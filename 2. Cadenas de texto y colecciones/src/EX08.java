import java.util.ArrayList;

public class EX08 {
    public static void main(String[] args) {
        ArrayList<String> aList = new ArrayList<String>();
        aList.add("First");
        aList.add("Second");
        aList.add("Third");
        aList.add("Fourth");
        aList.add("Fifth");

        aList.forEach( (element) -> { System.out.println(element); } );
    }
}