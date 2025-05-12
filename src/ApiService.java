import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiService {
    public double obterTaxaCambio(Moeda base, Moeda destino) throws Exception {
        String API_KEY = "chave API";
        String url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/" + base;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            return JsonUtils.extrairTaxa(response.body(), destino.toString());
        } else {
            throw new RuntimeException("Erro ao obter dados da API. Código: " + response.statusCode());
        }
    }
}

