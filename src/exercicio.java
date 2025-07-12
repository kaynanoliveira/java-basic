import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double valorPago;
        double totalDesconto = 0;
        double desconto = 0;
        double valorVeiculo;
        String combustivel;

        while (true){
            System.out.print("Digite o valor do veiculo (0 para sair): ");
            valorVeiculo = leitor.nextDouble();
            leitor.nextLine();

            if(valorVeiculo == 0){
                break;
            }

            System.out.print("Digite o tipo de combustivel do veiculo: ");
            combustivel = leitor.nextLine().toLowerCase();

            if(combustivel.equals("alcool")){
                desconto = valorVeiculo * 0.25;
            } else if (combustivel.equals("gasolina")) {
                desconto = valorVeiculo * 0.21;
            } else if (combustivel.equals("diesel")){
                desconto = valorVeiculo * 0.14;
            } else {
                System.out.println("Tipo de combustível inválido. Tente novamente.");
                return; // Encerra o programa
            }

            valorPago = valorVeiculo - desconto;
            totalDesconto += desconto;


            System.out.println("Valor do desconto = R$" + totalDesconto);
            System.out.println("Valor total = R$" + valorPago );

        }
    }
}