import java.util.Random;
import java.util.Scanner;

public class EX03 {
    public static void main(String[] args) {
        Random r = new Random();
        int[][] grid = new int[5][6];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                grid[i][j] = r.nextInt(10);
            }
        }
        int iTotal = 0, jTotal = 0;
        for (int i = 0; i < 4; i++) {
            int iSum = 0;
            for (int j = 0; j < 5; j++) {
                iSum += grid[i][j];
            }
            grid[i][5] = iSum;
            iTotal += iSum;
        }
        for (int j = 0; j < 5; j++) {
            int jSum = 0;
            for (int i = 0; i < 4; i++) {
                jSum += grid[i][j];
            }
            grid[4][j] = jSum;
            jTotal += jSum;
        }
        grid[4][5] = iTotal + jTotal;

        //pereza poner el output bonito siempre ajustando los espacios exactos
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(grid[i][j] + " | ");
                if (i < 4)
                    System.out.print(" ");
            }
            System.out.println("\n----------------------------");
        } 
    }
}
