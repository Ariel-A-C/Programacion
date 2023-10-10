import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EX01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] numbers = new Integer[10];
        for (int i = 0; i < numbers.length; i++){
            System.out.print("Escribe un número (entero porque me da pereza escribir 'double'): ");
            numbers[i] = sc.nextInt();
        }

		List<Integer> numList = Arrays.asList(numbers);
		Collections.shuffle(numList);
		numList.toArray(numbers);
        System.out.println(Arrays.toString(numbers));  
        int pos = 0, eq = 0, neg = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0)
                pos++;
            if (numbers[i] == 0)
                eq++;
            if (numbers[i] < 0)
                neg++; 
        }
        System.out.println("Superan 0: " + pos);
        System.out.println("Son 0: " + eq);
        System.out.println("Son negativos: " + neg);
    }
}