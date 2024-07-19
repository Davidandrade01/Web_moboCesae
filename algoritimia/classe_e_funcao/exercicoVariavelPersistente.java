import java.util.Scanner;

public class ValidacaoNumeroPositivo {
    
    static int numero;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        obterNumeroPositivo(scanner); 
        System.out.println("Você digitou um número positivo: " + numero);
        scanner.close();
    }

    public static void obterNumeroPositivo(Scanner scanner) {
        System.out.print("Digite um número positivo: ");
        int input = scanner.nextInt();

        if (input > 0) {
            numero = input; 
        } else {
            System.out.println("Número inválido! Por favor, digite um número positivo.");
            obterNumeroPositivo(scanner); 
        }
    }
}