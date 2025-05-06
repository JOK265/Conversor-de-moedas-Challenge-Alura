import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            mostrarMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> Conversor.converter(Moeda.USD, Moeda.ARS);
                case 2 -> Conversor.converter(Moeda.ARS, Moeda.USD);
                case 3 -> Conversor.converter(Moeda.USD, Moeda.BRL);
                case 4 -> Conversor.converter(Moeda.BRL, Moeda.USD);
                case 5 -> Conversor.converter(Moeda.ARS, Moeda.BRL);
                case 6 -> Conversor.converter(Moeda.BRL, Moeda.ARS);
                case 7 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 7);
    }

    private static void mostrarMenu() {
        System.out.println("\n======= Conversor de Moedas =======");
        System.out.println("1 - Dólar para Peso Argentino");
        System.out.println("2 - Peso Argentino para Dólar");
        System.out.println("3 - Dólar para Real Brasileiro");
        System.out.println("4 - Real Brasileiro para Dólar");
        System.out.println("5 - Peso Argentino para Real Brasileiro");
        System.out.println("6 - Real Brasileiro para Peso Argentino");
        System.out.println("7 - Sair");
        System.out.println("Escolha uma opção válida: ");
    }
}