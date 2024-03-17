import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeradorPrimeira, denominadorPrimeira, numeradorSegunda, denominadorSegunda,denominadorFinal, numeradorFinal;
        
        System.out.println("Para somar duas facoes, informe o numerador da prmeira:");
        numeradorPrimeira = scanner.nextInt();

        System.out.println("Agora o denominador da primeira: ");
        denominadorPrimeira = scanner.nextInt();

        System.out.println("Agora informe o numerador da segunda:");
        numeradorSegunda = scanner.nextInt();

        System.out.println("E por ultimo o denominador da segunda: ");
        denominadorSegunda = scanner.nextInt();

        denominadorFinal = denominadorPrimeira * denominadorSegunda;
        numeradorFinal = numeradorPrimeira * denominadorSegunda + numeradorSegunda * denominadorPrimeira;

        System.out.println("O resultado da somadas fracoes é:");
        System.out.println(numeradorFinal+"/"+denominadorFinal);

        scanner.close();
    }
}
