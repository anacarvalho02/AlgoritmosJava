
//Algoritmo495//

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];


        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }


        ordenarNomes(nomes);


        System.out.println("\n\nNOMES ORDENADOS\n");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println((i + 1) + " - " + nomes[i]);
        }

        scanner.close();
    }


    public static void ordenarNomes(String[] vetor) {
        String aux;
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i].compareTo(vetor[j]) > 0) {

                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
    }
}
