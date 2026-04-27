import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] caracteres = new char[10];
        int quantidadeConsoantes = 0;

        System.out.println("Digite 10 caracteres:");
        for (int i = 0; i < caracteres.length; i++) {
            System.out.print("Caractere " + (i + 1) + ": ");
            caracteres[i] = scanner.next().toLowerCase().charAt(0);
        }

        System.out.println("\nConsoantes lidas:");
        for (char c : caracteres) {
            if (Character.isLetter(c) && !ehVogal(c)) {
                System.out.println(c);
                quantidadeConsoantes++;
            }
        }

        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);

        scanner.close();
    }

    public static boolean ehVogal(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
