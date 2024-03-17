import java.util.Scanner;
public class Questao8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tamanhoArquivo, velocidadeInternet, tempoDowload;

        System.out.println("Para calcular o tempo  de dowload, Digite quandos megabytes tem seu arquivo: ");
        tamanhoArquivo = scanner.nextDouble();

        System.out.print("Qual a velocidade da sua internet? ");
        velocidadeInternet = scanner.nextDouble();

        tempoDowload = (tamanhoArquivo/(velocidadeInternet/8))/60;

        System.out.println("O tempo de download do arquivo é de: "+tempoDowload+" minutos.");
        
        scanner.close();
    }
}
