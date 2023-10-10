public class EX06 {
    public static void main(String[] args) {
        String str = "Cadenas de texto y coleccionables";
        for (int i = 0; i < str.length(); i++) {
            System.out.println("ASCII: " + (int)str.charAt(i) + " es equivalente a: " + str.charAt(i));
        }
    }
}