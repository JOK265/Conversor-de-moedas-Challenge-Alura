import java.util.Scanner;

public class Conversor {
    public static void converter(Moeda origem, Moeda destino) {
        ApiService apiService = new ApiService();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor a ser convertido: ");
        double valor = scanner.nextDouble();

        try {
            double taxa = apiService.obterTaxaCambio(origem, destino);
            double convertido = valor * taxa;

            System.out.println("O valor de %.2f (%s) corresponde ao valor final de ==> %.2f (%s)%n".formatted( valor, origem, convertido, destino));
        } catch (Exception e) {
            System.out.println("Erro ao converter moeda: " + e.getMessage());
        }
    }
}