import service.*;

public class main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        HttpClientService httpClientService = new HttpClientService();
        try {
            System.out.println(httpClientService.getExchangeRate());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
