public class LancamentoDeDados {
    // Variável global para armazenar o resultado do lançamento do dado
    static int resultado;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        lancarDado(scanner); // Chamada recursiva inicial
        System.out.println("Você lançou o dado e obteve: " + resultado);
        scanner.close();
    }

    public static void lancarDado(Scanner scanner) {
        System.out.print("Pressione Enter para lançar o dado...");
        scanner.nextLine(); // Espera o usuário pressionar Enter

        Random random = new Random();
        int valor = random.nextInt(6) + 1; // Gera um valor entre 1 e 6

        if (valor >= 1 && valor <= 6) {
            resultado = valor; // Atribuição à variável global
        } else {
            System.out.println("Valor inválido! Algo deu errado, tente novamente.");
            lancarDado(scanner); // Chamada recursiva
        }
    }
}