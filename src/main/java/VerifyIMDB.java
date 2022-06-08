import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;

public class VerifyIMDB {


    public static HttpRequest getRequest() {


        HttpRequest request = null;

        {
            try {
                request = HttpRequest
                        .newBuilder()
                        .uri(new URI("https://imdb-api.com/API/Search/k_12345678/leon%20the%20professional"))
                        .GET()
                        .build();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }


        return request;

    }
}
