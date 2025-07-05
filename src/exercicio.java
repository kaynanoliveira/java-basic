import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);
        double valorProduto;
        double prestacao;

        System.out.print("Digite o valor do produto: ");
        valorProduto = leitorScanner.nextDouble();

        prestacao = valorProduto / 5;

        System.out.println("Valor do produto = " + valorProduto);
        System.out.println("Prestações = " + prestacao);
    }
}