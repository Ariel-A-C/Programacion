import java.util.Scanner;

public class EX05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Contraseña: ");
        String pswd = sc.nextLine();
        
        boolean u = false, l = false, s = false, d = false;
        for (int i = 0; i < pswd.length(); i++) {
            if (Character.isUpperCase(pswd.charAt(i))) {
                u = true;
            } else if (Character.isLowerCase(pswd.charAt(i))) {
                l = true;
            } else if (pswd.charAt(i) >= 48 && pswd.charAt(i) <= 57) {
                d = true;
            } else {
                s = true;
            }
        }

        if (pswd.length() >= 8 && u && l && s && d) {
            System.out.println("Contraseña fuerte");
        } else {
            System.out.println("Contraseña débil");
        }
    }
}