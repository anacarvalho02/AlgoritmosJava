import java.util.Scanner;

public class Algoritmo497 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];


        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }


        System.out.print("Digite numero de busca: ");
        int chave = scanner.nextInt();


        ordenarVetor(numeros);


        int posicao = buscaBinaria(numeros, chave);


        System.out.println("\nVETOR");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println((i + 1) + " - " + numeros[i]);
        }


        if (posicao != -1) {
            System.out.println("\n\nPosição no vetor: " + (posicao + 1));
        } else {
            System.out.println("\n\nNÃO ENCONTRADO");
        }

        scanner.close();
    }


    public static void ordenarVetor(int[] vetor) {
        int aux;
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] > vetor[j]) {
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
    }


    public static int buscaBinaria(int[] vetor, int chave) {
        int inicio = 0, fim = vetor.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (vetor[meio] == chave) {
                return meio;
            } else if (chave < vetor[meio]) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }

        return -1; 
    }
}
