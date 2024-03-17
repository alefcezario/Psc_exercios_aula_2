import java.util.Scanner;

public class Questao5 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double larguraRetangulo, alturaRetangulo, areaRetangulo, perimetroRetangulo, diagonalRetangulo;

        System.out.println("Para calcular a Área, o Perímetro e a Diagonal do Retângulo, digite a largura do mesmo: ");
        larguraRetangulo = scanner.nextDouble();

        System.out.println("agora digite a altura: ");
        alturaRetangulo = scanner.nextDouble();

        areaRetangulo = larguraRetangulo * alturaRetangulo;

        perimetroRetangulo = 2 * (larguraRetangulo + alturaRetangulo);

        diagonalRetangulo = Math.sqrt(Math.pow(larguraRetangulo, 2) + Math.pow(alturaRetangulo, 2));

        System.out.println("De acordo com os dados inseridos a area do retangulo será: "+areaRetangulo);
        System.out.println("Seu perimetro será: " + perimetroRetangulo);
        System.out.println("E sua Diagonal será: " + diagonalRetangulo);
        scanner.close();
    }
}
