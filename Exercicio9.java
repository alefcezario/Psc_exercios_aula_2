/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio9;

/**
 *
 * @author aluno
 */
import java.util.Scanner;

public class Exercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       double peso;
       double altura;
       double imc;
                     
       Scanner entrada = new Scanner(System.in);
      
         System.out.println("Digite sua altura: ");
  
         altura = entrada.nextDouble();
         
         System.out.println("Digite seu peso: ");
         peso = entrada.nextDouble();
         
         
         imc = peso/(altura * altura);
               
        System.out.println("Seu imc: ");
        
         entrada.close();
        
        
    }
    
}
