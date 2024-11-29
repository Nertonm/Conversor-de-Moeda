package service;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ConversorService {
    private static final Logger logger = Logger.getLogger(ConversorService.class.getName());
    private final HttpClientService httpClientService =  new HttpClientService();

    public String dollarToArgentinePeso(float value) {
        try {
            String response = httpClientService.getExchangeRate("USD", "ARS");
            return String.valueOf(Float.parseFloat(response) * value);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error converting dollar to Argentine Peso", e);
        }
        return "Error";
    }

    public String argentinePesoToDollar(float value) {
        try {
            String response = httpClientService.getExchangeRate("ARS", "USD");
            return String.valueOf(Float.parseFloat(response) * value);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error converting Argentine Peso to dollar", e);
        }
        return "Error";
    }

    public String dollarToBrazilianReal(float value) {
        try {
            String response = httpClientService.getExchangeRate("USD", "BRL");
            return String.valueOf(Float.parseFloat(response) * value);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error converting dollar to Brazilian Real", e);
        }
        return "Error";
    }

    public String brazilianRealToDollar(float value) {
        try {
            String response = httpClientService.getExchangeRate("BRL", "USD");
            return String.valueOf(Float.parseFloat(response) * value);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error converting Brazilian Real to dollar", e);
        }
        return "Error";
    }

    public String dollarToColombianPeso(float value) {
        try {
            String response = httpClientService.getExchangeRate("USD", "COP");
            return String.valueOf(Float.parseFloat(response) * value);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error converting dollar to Colombian Peso", e);
        }
        return "Error";
    }

    public String colombianPesoToDollar(float value) {
        try {
            String response = httpClientService.getExchangeRate("COP", "USD");
            return String.valueOf(Float.parseFloat(response) * value);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error converting Colombian Peso to dollar", e);
        }
        return "Error";
    }
}
