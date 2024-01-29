import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {

    public static void main(String[] args) {
        // URL de la API JSONPlaceholder para obtener datos de usuarios
        String apiUrl = "https://jsonplaceholder.typicode.com/users/1";

        // Crear un cliente HTTP
        HttpClient httpClient = HttpClient.newHttpClient();

        // Crear una solicitud GET
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(apiUrl))
                .GET()
                .build();

        try {
            // Enviar la solicitud y recibir la respuesta
            HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

            // Imprimir el código de estado y el cuerpo de la respuesta
            System.out.println("Código de estado: " + httpResponse.statusCode());
            System.out.println("Respuesta: " + httpResponse.body());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
