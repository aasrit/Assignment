package Handson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpReqCliEx {
    public static void main(String[] args) throws IOException, InterruptedException {
        String uri="https://postman-echo.com/get?uname=aasu&pwd=1002";
        HttpRequest req=HttpRequest.newBuilder().uri(URI.create(uri)).GET().version(HttpClient.Version.HTTP_1_1).build();
        HttpClient client=HttpClient.newBuilder().build();
        HttpResponse<String> resp=client.send(req, HttpResponse.BodyHandlers.ofString());
        System.out.println(resp.body());
        System.out.println(resp.statusCode());

    }
}
