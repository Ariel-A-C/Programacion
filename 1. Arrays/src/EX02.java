import java.util.Scanner;

public class EX02 {
    public static void main(String[] args) {
        String[] values = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

        Scanner sc = new Scanner(System.in);
        System.out.print("DNI: ");
        String DNI = sc.nextLine();
        int number = Integer.parseInt(DNI.substring(0, 8));
        String letter = DNI.substring(8);
        int remainder = number % 23;

        if (letter.toUpperCase().equals(values[remainder])) {
            System.out.println(DNI + " es válido.");
        } else {
            System.out.println(DNI + " no es válido. La letra correspondiente sería la " + values[remainder] + ".");
        }
    }
}
