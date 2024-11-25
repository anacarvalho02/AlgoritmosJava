import java.util.Scanner;

public class Algoritmo480 {

    public static int reverso(int num) {
        int soma = 0;
        while (num != 0) {
            int r = num % 10;
            soma = soma * 10 + r;
            num = num / 10;
        }
        return soma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = scanner.nextInt();
        int x = reverso(n); 

        System.out.println("\n" + n + " - " + x);

        if (x == n) {
            System.out.println("É um número capicua.");
        } else {
            System.out.println("Não é um número capicua.");
        }

        scanner.close();
    }
}
