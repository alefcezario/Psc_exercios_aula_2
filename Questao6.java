import java.util.Scanner;
public class QUestao6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double larguraArea, comprimentoArea, larguraCeramica, comprimentoCeramica;
        double larguraCeramicaMetros, comprimentoCeramicaMetros, areaRevestida, areaCeramica,qtdCeramica;

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
 
        areaRevestida = Math.ceil(larguraArea * comprimentoArea * 1.1);
        areaCeramica = larguraCeramicaMetros * comprimentoCeramicaMetros;
        qtdCeramica = areaRevestida / areaCeramica;

        System.out.println("Você precisará de " + qtdCeramica + " peças de cerâmica.");

        scanner.close();
    }
}
