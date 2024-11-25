
//Algoritmo460//

import java.util.Scanner;

public class Main {

    public static int dob(int x) {
        return x * 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        for (int c = 0; c < 3; c++) {
            System.out.print("\nDigite um número: ");
            int a = scanner.nextInt();
            System.out.println("Dobro: " + dob(a));
        }

        scanner.close();
    }
}
