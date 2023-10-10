import java.util.Scanner;

public class EX02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cadena 1: ");
        String str1 = sc.nextLine();
        System.out.print("Cadena 2: ");
        String str2 = sc.nextLine();
        String str = "";

        if (str1.length() <= str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) == ' ' && str2.charAt(i) != ' ') {
                    str = str + str2.charAt(i);
                } else if (str1.charAt(i) != ' ' && str2.charAt(i) == ' ') {
                    str = str + str1.charAt(i);
                } else if (str1.charAt(i) != ' ' && str2.charAt(i) != ' ') {
                    str = str + str1.charAt(i) + str2.charAt(i);
                }
            }
            str = str + str2.substring(str1.length(), str2.length());
        } else {
            for (int i = 0; i < str2.length(); i++) {
                if (str1.charAt(i) == ' ' && str2.charAt(i) != ' ') {
                    str = str + str2.charAt(i);
                } else if (str1.charAt(i) != ' ' && str2.charAt(i) == ' ') {
                    str = str + str1.charAt(i);
                } else if (str1.charAt(i) != ' ' && str2.charAt(i) != ' ') {
                    str = str + str1.charAt(i) + str2.charAt(i);
                }
            }
            str = str + str1.substring(str2.length(), str1.length());
        }
        System.out.println(str);
    }
}