import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class ClientHttpExemplo {

    static ExecutorService executor = Executors.newFixedThreadPool(6, new ThreadFactory() {
        @Override
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            System.out.println("Nova thread criada! " +(thread.isDaemon() ? "daemon" : "") + "ThreadGroup: "+thread.getThreadGroup());
            return thread;
        }
    });


    public static void main(String[] args) throws IOException, InterruptedException {
        connectAndPrintURLJavaOracle();
    }

    private static void connecctAkamaiHttpClient() {
        System.out.println("Running HTTP/1.1...");
        try {
            HttpClient httpClient = HttpClient.newBuilder()
                    .version(HttpClient.Version.HTTP_1_1)
                    .proxy(ProxySelector.getDefault())
                    .build();

            long start = System.currentTimeMillis();

            HttpRequest mainRequest = HttpRequest.newBuilder()
                    .uri(URI.create("https://http2.akamai.com/demo/h2_demo_frame.html"))
                    .build();
            HttpResponse<String> httpResponse = httpClient.send(mainRequest, HttpResponse.BodyHandlers.ofString());
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }



        public static void connectAndPrintURLJavaOracle() throws IOException, InterruptedException {
            // SEM HTTPCLIENT
            /* try {
                var url = new URL("https://docs.oracle.com/javase/10/language");
                var urlConnection = url.openConnection();

                try (var bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))){
                    System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));
                }

            } catch (Exception e){
                e.printStackTrace();
            }*/

            HttpRequest request = HttpRequest.newBuilder()
                    .GET().uri(URI.create("https://docs.oracle.com/javase/10/language/"))
                    .build();

            HttpClient httpClient = HttpClient.newHttpClient();
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("Status Code: "+response.statusCode());
            System.out.println("Header response: "+response.headers());
//            System.out.println("Body response: "+response.body());
            String responseBody = response.body();

            List<Future<?>> future = new ArrayList<>();

            responseBody
                    .lines()
                    .filter(line -> line.trim().startsWith("<img height"))
                    .map(line -> line.substring(line.indexOf("src=''")+5, line.indexOf("'/>'")))
                    .forEach(image ->{
                        Future<?> imgFuture = executor.submit(() ->{
                            HttpRequest imgRequest = HttpRequest.newBuilder()
                                    .uri(URI.create("https://http2.akamai.com" + image))
                                    .build();

                            try {
                                HttpResponse<String> imageResponse = httpClient.send(imgRequest, HttpResponse.BodyHandlers.ofString());
                                System.out.println("Imagem carregada::: "+image+", Status code: "+imageResponse.statusCode());
                            } catch (IOException | InterruptedException e) {
                                e.printStackTrace();
                            }
                        });
                        future.add(imgFuture);
                        System.out.println("Submitted: "+image);
                    });

            future.forEach(f -> {
                try {
                    f.get();
                } catch (InterruptedException | ExecutionException e){
                    e.printStackTrace();
                }
            });

            long end = System.currentTimeMillis();
            System.out.println("Tempo de carregamento: "+ (end-start) +" ms");
        }
    }

