import java.util.Scanner;

public class ValidacaoNumeroPositivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = obterNumeroPositivo(scanner);
        System.out.println("Você digitou um número positivo: " + numero);
        scanner.close();
    }

    public static int obterNumeroPositivo(Scanner scanner) {
        System.out.print("Digite um número positivo: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            return numero;
        } else {
            System.out.println("Número inválido! Por favor, digite um número positivo.");
            return obterNumeroPositivo(scanner); // Chamada recursiva
        }
    }
}
