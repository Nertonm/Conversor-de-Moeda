package consoleUI;

import java.util.Scanner;
import facade.ConversorFacade;

public class ConsoleUI {

    public static void start() {
        ConversorFacade conversorFacade = new ConversorFacade();
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        while (option != 7) {
            System.out.println("Seja bem-vindo/a ao Conversor de Moeda =]\n");
            System.out.println("1) Dólar => Peso argentino");
            System.out.println("2) Peso argentino => Dólar");
            System.out.println("3) Dólar => Real brasileiro");
            System.out.println("4) Real brasileiro => Dólar");
            System.out.println("5) Dólar => Peso colombiano");
            System.out.println("6) Peso colombiano => Dólar");
            System.out.println("7) Sair\n");
            System.out.println("Escolha uma opção válida:");
            option = scanner.nextInt();
            float value;
            switch (option) {
                case 1:
                    System.out.println("Digite o valor em dólar:");
                    value = scanner.nextFloat();
                    System.out.println("O valor em peso argentino é: " + conversorFacade.dollarToArgentinePeso(value));
                    break;
                case 2:
                    System.out.println("Digite o valor em peso argentino:");
                    value = scanner.nextFloat();
                    System.out.println("O valor em dólar é: " + conversorFacade.argentinePesoToDollar(value));
                    break;
                case 3:
                    System.out.println("Digite o valor em dólar:");
                    value = scanner.nextFloat();
                    System.out.println("O valor em real brasileiro é: " + conversorFacade.dollarToBrazilianReal(value));
                    break;
                case 4:
                    System.out.println("Digite o valor em real brasileiro:");
                    value = scanner.nextFloat();
                    System.out.println("O valor em dólar é: " + conversorFacade.brazilianRealToDollar(value));
                    break;
                case 5:
                    System.out.println("Digite o valor em dólar:");
                    value = scanner.nextFloat();
                    System.out.println("O valor em peso colombiano é: " + conversorFacade.dollarToColombianPeso(value));
                    break;
                case 6:
                    System.out.println("Digite o valor em peso colombiano:");
                    value = scanner.nextFloat();
                    System.out.println("O valor em dólar é: " + conversorFacade.colombianPesoToDollar(value));
                    break;
                case 7:
                    System.out.println("Até mais =]");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
