import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int anoVeiculo;
        float valorDesconto;
        float valorVeiculo;
        float valorComDesconto;
        int totalSemiNovos = 0;
        int totalDeCarros = 0;
        char desejaContinuar = 's';

        while(desejaContinuar == 'S' || desejaContinuar == 's'){
            System.out.println("Digite o ano do veiculo: ");
            anoVeiculo = leitor.nextInt();

            System.out.println("Digite o valor do veiculo: ");
            valorVeiculo = leitor.nextFloat();

            if(anoVeiculo <= 2000){
                valorDesconto = valorVeiculo * 0.12f;
                valorComDesconto = valorVeiculo - valorDesconto;
                totalSemiNovos++;
            }else{
                valorDesconto = valorVeiculo * 0.07f;
                valorComDesconto = valorVeiculo - valorDesconto;
            }
            System.out.println("O valor do desconto foi de: " + valorDesconto);
            System.out.println("Valor com desconto: " + valorComDesconto);
            totalDeCarros++;

            System.out.println("Deseja continuar? S - Sim / N - Não: ");
            desejaContinuar = leitor.next().charAt(0);
        }
        System.out.println("Total de carros semi novos = " + totalSemiNovos);
        System.out.println("Total de carros = " + totalDeCarros);
    }
}