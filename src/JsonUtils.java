import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JsonUtils {

    public static double extrairTaxa(String json, String codigoMoeda) {
        JsonObject raiz = JsonParser.parseString(json).getAsJsonObject();
        JsonObject taxas = raiz.getAsJsonObject("conversion_rates");
        return taxas.get(codigoMoeda).getAsDouble();
    }
}
