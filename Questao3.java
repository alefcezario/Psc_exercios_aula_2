import java.util.Scanner;
public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double catetoa, catetob, hipotennusac;

        System.out.println("Para calcular o teorema de pitagoras, digite o cateto a: ");
        catetoa = scanner.nextDouble();
        System.out.println("Agora digite o cateto b: ");
        catetob = scanner.nextDouble();

        hipotennusac = Math.sqrt(Math.pow(catetoa, 2) + Math.pow(catetob, 2));

        System.out.println("A hipotenusa c é: "+hipotennusac);
        scanner.close();


    }
}
