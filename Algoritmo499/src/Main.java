
//Algoritmo499//

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];
        boolean dadosPreenchidos = false;
        int opcao;

        do {

            System.out.println("\n\n\nMENU VETOR - FUNCAO");
            System.out.println("1. Dados do VETOR");
            System.out.println("2. Ordena VETOR");
            System.out.println("3. Imprime VETOR");
            System.out.println("4. Sai do programa");
            System.out.print("OPCAO: ");
            opcao = scanner.nextInt();


            switch (opcao) {
                case 1:
                    preencherVetor(vetor, scanner);
                    dadosPreenchidos = true;
                    break;

                case 2:
                    if (dadosPreenchidos) {
                        ordenarVetor(vetor);
                        System.out.println("Vetor ordenado com sucesso!");
                    } else {
                        System.out.println("\nEscolha primeiro a opcao 1.");
                    }
                    break;

                case 3:
                    if (dadosPreenchidos) {
                        imprimirVetor(vetor);
                    } else {
                        System.out.println("\nEscolha primeiro a opcao 1.");
                    }
                    break;

                case 4:
                    System.out.println("\nSaindo do algoritmo.");
                    break;

                default:
                    System.out.println("\nOpcao invalida.");
                    break;
            }
        } while (opcao != 4);

        scanner.close();
    }


    public static void preencherVetor(int[] vetor, Scanner scanner) {
        System.out.println("\nEntrada do VETOR");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite numero " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
    }


    public static void ordenarVetor(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] > vetor[j]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;
                }
            }
        }
    }


    public static void imprimirVetor(int[] vetor) {
        System.out.println("\nVETOR");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println((i + 1) + " - " + vetor[i]);
        }
    }
}
