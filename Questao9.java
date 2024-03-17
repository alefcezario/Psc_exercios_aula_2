import java.util.Scanner;

public class Questao9 {
        public static void main(String[] args) {
        // TODO code application logic here
       double peso, alturaCentimentos, alturaMetros, imc;
       double pesoIdeal, pesoAjustado;
                     
       Scanner entrada = new Scanner(System.in);
      
         System.out.println("Digite sua altura em centimentros: ");
         alturaCentimentos = entrada.nextDouble();
         alturaMetros = alturaCentimentos/100;
         
         System.out.println("Digite seu peso em Kg: ");
         peso = entrada.nextDouble();
                  
         imc = peso/(alturaMetros * alturaMetros);
         pesoIdeal = 22*alturaMetros*alturaMetros;
         pesoAjustado = 23*alturaMetros*alturaMetros;

        System.out.println("Seu imc: "+imc);
        System.out.println("Seu peso ideal em KG é: "+pesoIdeal);
        System.out.println("Seu peso ideal em KG ajustado é: "+pesoAjustado);
        
         entrada.close();
        
        
    }
}
