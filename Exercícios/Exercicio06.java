import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] medias = new double[10];
        int aprovados = 0;

        for (int aluno = 0; aluno < 10; aluno++) {
            double soma = 0;
            System.out.println("Aluno " + (aluno + 1) + ":");

            for (int nota = 0; nota < 4; nota++) {
                System.out.print("Digite a nota " + (nota + 1) + ": ");
                soma += scanner.nextDouble();
            }

            medias[aluno] = soma / 4.0;

            if (medias[aluno] >= 7.0) {
                aprovados++;
            }
        }

        System.out.println("\nMédias dos alunos:");
        for (int i = 0; i < medias.length; i++) {
            System.out.println("Aluno " + (i + 1) + ": " + medias[i]);
        }

        System.out.println("\nQuantidade de alunos com média maior ou igual a 7.0: " + aprovados);

        scanner.close();
    }
}
