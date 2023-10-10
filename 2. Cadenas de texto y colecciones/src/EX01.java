import java.util.Scanner;

public class EX01 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre y apellidos: ");
        String full = sc.nextLine();

        int count = full.length() - full.replace(" ", "").length(); //cortesía de Stack Overflow porque me parece muy buena línea
        int x = 0;
 
        for (int i = 0; i < (count-2); i++) {
            x = full.indexOf(" ", x+1);
        }

        int s1 = full.indexOf(" ", x+1);
        int s2 = full.indexOf(" ", s1+1);
        String surname1 = full.substring(s1 + 1, s2);
        String surname2 = full.substring(s2 + 1);

        String name = "";
        for (int i = 0; i < s1; i++) {
            if (Character.isUpperCase(full.charAt(i))) { //la mejor idea de mi vida
                name = name + " " + full.charAt(i) + ".";
            }
        }

        System.out.println(surname1 + " " + surname2 + "," + name);
    }
}