
//Algoritmo470//

import java.util.Scanner;

public class Main {

    public static boolean isPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int p = 2; p <= n / 2; p++) {
            if (n % p == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número > 0: ");
        int num = scanner.nextInt();

        if (isPrimo(num)) {
            System.out.println(num + " é primo.");
        } else {
            System.out.println(num + " não é primo.");
        }

        scanner.close();
    }
}
