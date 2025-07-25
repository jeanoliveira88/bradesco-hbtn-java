import java.util.Scanner;

public class ArrayExercicio {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner scanner = new Scanner(System.in);

        // Preencher o array com números fornecidos pelo usuário
        System.out.println("Insira 10 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Calcular a soma e encontrar o maior número
        int soma = 0;
        int maior = numeros[0];
        for (int numero : numeros) {
            soma += numero;
            if (numero > maior) {
                maior = numero;
            }
        }

        // Exibir o conteúdo do array
        System.out.print("Array: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        // Exibir a soma e o maior número
        System.out.println("\nSoma dos números: " + soma);
        System.out.println("Maior número: " + maior);

        scanner.close();
    }
}
