import java.util.Scanner;
public class Questao7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double larguraArea, comprimentoArea, larguraCeramica, comprimentoCeramica;
        double larguraCeramicaMetros, comprimentoCeramicaMetros, areaRevestida, areaCeramica,qtdCeramica;
        double precoMetro, precoFinal;

        System.out.println("Qua a largura em metros da área a ser revestida? ");
        larguraArea = scanner.nextDouble();

        System.out.println("Qual o comprimento em metros da área a ser revestida? ");
        comprimentoArea = scanner.nextDouble();

        System.out.println("Quanos centimetros de largura tem a ceramica? ");
        larguraCeramica = scanner.nextDouble(); 
        larguraCeramicaMetros = larguraCeramica/100;

        System.out.println("Quanos centimetros de comprimento tem a ceramica? ");
        comprimentoCeramica = scanner.nextDouble(); 
        comprimentoCeramicaMetros = comprimentoCeramica/100;

        System.out.println("Qual o preço do metro quadrado da ceramica escolhida? ");
        precoMetro = scanner.nextDouble();
        
        areaRevestida = Math.ceil(larguraArea * comprimentoArea * 1.1);
        areaCeramica = larguraCeramicaMetros * comprimentoCeramicaMetros;
        qtdCeramica = areaRevestida / areaCeramica;
        precoFinal = areaCeramica*qtdCeramica*precoMetro;
        
        System.out.println("Você precisará de " + qtdCeramica + " peças de cerâmica.\nE isso custará: R$ "+precoFinal);

        scanner.close();
    }
    
}
