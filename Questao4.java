import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double primeiraGrandeza, segundaGrandeza, terceiraGrandeza, valorFinal;

        System.out.println("Para calcular a recgra de 3 digite o valor da primeira grandeza: ");
        primeiraGrandeza = scanner.nextDouble();
        System.out.println("Agora digite a segunda grandeza: ");
        segundaGrandeza = scanner.nextDouble();
        System.out.println("E por ultimo digite a terceira grandeza: ");
        terceiraGrandeza = scanner.nextDouble();

        valorFinal = terceiraGrandeza*primeiraGrandeza/segundaGrandeza;

        System.out.println("O valor final da regra de tres é: "+valorFinal);

        scanner.close();
                
    }
}
