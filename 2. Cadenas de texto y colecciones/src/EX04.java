import java.util.Scanner;
public class EX04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Frase: ");
        String frase = sc.nextLine();
        System.out.print("Carácter: ");
        Character ch = sc.next().charAt(0);

        System.out.println("Posiciones:");       
        int min = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.indexOf(ch, min) < 0) {
                break;
            }
            System.out.println(frase.indexOf(ch, min));
            min = frase.indexOf(ch, min) + 1;    
        }
    }
}