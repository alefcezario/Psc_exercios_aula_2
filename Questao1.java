/**
 *
 * @author alef
 */
import java.util.Scanner;

public class Questao1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int hora;
       int minuto;
       int horaCheia = 60;
       int totalMinutos;
              
       Scanner entrada = new Scanner(System.in);
      
         System.out.println("Digite a hora atual: ");
  
         hora = entrada.nextInt();
         
         System.out.println("Agora digite os minutos: ");
         minuto = entrada.nextInt();
         
        totalMinutos = (hora*horaCheia)+minuto;
              
         
         System.out.println("Já se passaram "+(totalMinutos)+" minutos desde o inicio do dia");
         
         entrada.close();
    }
    
}
