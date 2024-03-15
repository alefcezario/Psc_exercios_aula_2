import java.util.Scanner;

public class Questao11 {
 public static void main(String[] args) {
    double potenciaEquipamento, horasLigado, valorKwh, consumoTotal, valorPago;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Para calcular o gasto de energia do equipamento, insira as informações solicitadas: ");
    System.out.println("Potencia em Watts: ");
    potenciaEquipamento = scanner.nextDouble();

    System.out.println("Quantidade de horas ligado po dia: ");
    horasLigado = scanner.nextDouble();

    System.out.println("Valor do KW/h: ");
    valorKwh = scanner.nextDouble();

    consumoTotal = potenciaEquipamento*horasLigado/1000;

    valorPago = consumoTotal*valorKwh;

    System.out.println("Seu equipamento consumiu "+consumoTotal+" Kwh");
    System.out.println("E você pagara "+valorPago+" reais diariamente");

    scanner.close();
 }    
}
