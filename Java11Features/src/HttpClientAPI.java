import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientAPI {
    public static void main(String[] args) throws IOException, InterruptedException {
        String uri="https://httpbin.org/get";
        HttpRequest req=HttpRequest.newBuilder().uri(URI.create(uri)).GET().version(HttpClient.Version.HTTP_1_1).build();
        HttpClient client=HttpClient.newBuilder().build();
        HttpResponse<String> resp=client.send(req, HttpResponse.BodyHandlers.ofString());
        System.out.println(resp.body());
        System.out.println(resp.statusCode());
    }

}
