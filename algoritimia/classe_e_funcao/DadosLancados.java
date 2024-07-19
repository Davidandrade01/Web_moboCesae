import java.util.Random;
import java.util.Scanner;

public class DadosLancados {
    // Variável global para armazenar o resultado do lançamento do dado
    static int resultado;
    static int faces;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        escolherDado(scanner); // Chamada recursiva inicial para escolher o dado
        lancarDado(scanner); // Chamada recursiva inicial para lançar o dado
        System.out.println("Você lançou um dado de " + faces + " faces e obteve: " + resultado);
        scanner.close();
    }

    public static void escolherDado(Scanner scanner) {
        System.out.print("Escolha o tipo de dado para lançar (4, 6 ou 8 faces): ");
        int escolha = scanner.nextInt();
        scanner.nextLine(); // Consome a nova linha deixada pelo nextInt()

        if (escolha == 4 || escolha == 6 || escolha == 8) {
            faces = escolha; // Atribuição à variável global
        } else {
            System.out.println("Escolha inválida! Por favor, escolha um dado de 4, 6 ou 8 faces.");
            escolherDado(scanner); // Chamada recursiva
        }
    }

    public static void lancarDado(Scanner scanner) {
        System.out.print("Pressione Enter para lançar o dado...");
        scanner.nextLine(); // Espera o usuário pressionar Enter

        Random random = new Random();
        int valor = random.nextInt(faces) + 1; // Gera um valor entre 1 e o número de faces do dado

        if (valor >= 1 && valor <= faces) {
            resultado = valor; // Atribuição à variável global
        } else {
            System.out.println("Valor inválido! Algo deu errado, tente novamente.");
            lancarDado(scanner); // Chamada recursiva
        }
    }
}