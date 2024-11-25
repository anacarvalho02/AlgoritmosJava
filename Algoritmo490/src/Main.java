
//Algoritmo490//

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] palavras = new String[10];
        char charParaRemover = 'c';


        for (int i = 0; i < 10; i++) {
            System.out.print("Digite palavra em letras minúsculas " + (i + 1) + ": ");
            palavras[i] = scanner.nextLine();
        }


        for (int i = 0; i < 10; i++) {
            int removidos = substituirCaracter(palavras, i, charParaRemover);
            System.out.println((i + 1) + " - " + palavras[i] + " (Total de caracteres removidos: " + removidos + ")");
        }

        scanner.close();
    }


    public static int substituirCaracter(String[] palavras, int index, char charParaRemover) {
        char[] caracteres = palavras[index].toCharArray();
        int contador = 0;

        for (int i = 0; i < caracteres.length; i++) {
            if (caracteres[i] == charParaRemover) {
                caracteres[i] = '*';
                contador++;
            }
        }


        palavras[index] = new String(caracteres);
        return contador;
    }
}
