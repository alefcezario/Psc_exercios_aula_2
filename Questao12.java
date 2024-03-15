import java.util.Scanner;

public class Questao12 {
 public static void main(String[] args) {
    double potenciaEquipamento, horasLigado, valorKwh, consumoTotal, valorPago, custoMensal;

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
    custoMensal = valorPago*30;

    System.out.println("Seu equipamento consumiu "+consumoTotal+" Kwh");
    System.out.println("E você pagara "+valorPago+" reais diariamente");
    System.out.println("No mês seu custo será de "+custoMensal+" reais aproximadamente");

    scanner.close();
 }    
}
