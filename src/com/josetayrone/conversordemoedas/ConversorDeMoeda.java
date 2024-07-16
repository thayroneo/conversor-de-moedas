package com.josetayrone.conversordemoedas;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Properties;
import org.json.JSONObject;

public class ConversorDeMoeda {
    private String apiKey;
    private String apiUrl;

    public ConversorDeMoeda() {
        carregarConfiguracoes();
    }

    private void carregarConfiguracoes() {
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream("src/resources/config.properties"));
            apiKey = prop.getProperty("api_key");
            apiUrl = prop.getProperty("api_url");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.exit(1); // Encerra o programa em caso de falha na leitura do arquivo de configuração
        }
    }

    public double obterTaxaDeCambio(String deMoeda, String paraMoeda) throws Exception {
        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest requisicao = HttpRequest.newBuilder()
                .uri(URI.create(apiUrl + apiKey + "/latest/" + deMoeda))
                .build();

        HttpResponse<String> resposta = cliente.send(requisicao, HttpResponse.BodyHandlers.ofString());
        JSONObject respostaJson = new JSONObject(resposta.body());
        double taxa = respostaJson.getJSONObject("conversion_rates").getDouble(paraMoeda);

        return taxa;
    }

    public double converter(double valor, double taxa) {
        return valor * taxa;
    }
}
