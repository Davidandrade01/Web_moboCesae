
import java.util.Scanner;

class Minutos {

    // Variável de instância
    int hour = 1440;

    // Construtor
    Minutos() {
        System.out.println("Digite um número inteiro");
        Scanner scn = new Scanner(System.in);
        int dias = scn.nextInt();
        System.out.println("Você digitou " + dias);
        scn.close();
    }

    // Método principal
    public static void main(String[] args) {
        new Minutos();
    }
}