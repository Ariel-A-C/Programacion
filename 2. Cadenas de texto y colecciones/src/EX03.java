import java.util.Scanner;
public class EX03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Frase: ");
        String frase = sc.nextLine();
        System.out.print("Carácter: ");
        Character ch = sc.next().charAt(0);

        System.out.println("Posiciones:");
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ch) {
                System.out.println(i);
            }
        }
    }
}