package facade;

import service.ConversorService;

public class ConversorFacade {
    private final ConversorService conversorService = new ConversorService();

    public String dollarToArgentinePeso(float value) {
        return conversorService.dollarToArgentinePeso(value);
    }

    public String argentinePesoToDollar(float value) {
        return conversorService.argentinePesoToDollar(value);
    }

    public String dollarToBrazilianReal(float value) {
        return conversorService.dollarToBrazilianReal(value);
    }

    public String brazilianRealToDollar(float value) {
        return conversorService.brazilianRealToDollar(value);
    }

    public String dollarToColombianPeso(float value) {
        return conversorService.dollarToColombianPeso(value);
    }

    public String colombianPesoToDollar(float value) {
        return conversorService.colombianPesoToDollar(value);
    }
}
