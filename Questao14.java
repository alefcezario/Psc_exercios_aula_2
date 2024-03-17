import java.util.Scanner;

public class Questao14 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double xPrimeiroPronto, YPrimeiroPonto, xSegundoPonto, ySegundoPonto, distanciaPontos;

        System.out.println("Para calcular a Distância entre Dois Pontos no Plano Cartesiano Informe as coordenadas do primeiro ponto:");
        System.out.println("x1: ");
        xPrimeiroPronto = scanner.nextDouble();
        
        System.out.println("y1: ");
        YPrimeiroPonto = scanner.nextDouble();

        System.out.println("Agora informe as coordenadas do segundo ponto:");
        System.out.println("x2: ");
        xSegundoPonto = scanner.nextDouble();

        System.out.println("y2: ");
        ySegundoPonto = scanner.nextDouble();

        distanciaPontos = Math.sqrt(Math.pow(xPrimeiroPronto - xSegundoPonto, 2) + Math.pow(YPrimeiroPonto - ySegundoPonto, 2));
        
        System.out.println("A distância entre os pontos é: " + distanciaPontos);

        scanner.close();
    }
}
