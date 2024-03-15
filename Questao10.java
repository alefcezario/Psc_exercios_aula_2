import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {

        double peso;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor, digite seu peso atual: ");
        peso = entrada.nextDouble();
        double qtdRecomendada = peso*35/1000;

        System.out.println("A recomendação é que você deve consumir diáriamente: "+qtdRecomendada+" litros de água!");
    
 
    }
}
