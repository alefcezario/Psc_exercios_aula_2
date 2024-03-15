/**
 * @author alef
 */
import java.util.Scanner;

public class Questao2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {

       double valorEtanol;
       double valorGasolina;
       double setentaPorcentoGasolina;
       
              
       Scanner entrada = new Scanner(System.in);
      
         System.out.println("Digite o preço do etanol: ");
  
         valorEtanol = entrada.nextDouble();
         
         System.out.println("Agora o preço da gasolina: ");
         valorGasolina = entrada.nextDouble();
         
         setentaPorcentoGasolina = valorGasolina/100*70;
         
        if (valorEtanol<setentaPorcentoGasolina ){
            
         System.out.println("Está valendo a pena abastecer com Etanol! ");
         
        }else{
         System.out.println("Está valendo a pena abastecer com Gasolina! ");   
        }
         
         entrada.close();
    }
    
}
