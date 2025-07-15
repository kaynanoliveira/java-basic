import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double valorkWh;
        double valorTotal;
        int quantidadekWh;
        char tipoCliente;

        System.out.print("Digite o tipo de cliente: ");
        tipoCliente = leitor.next().charAt(0);

        System.out.print("Informe a quantidade de kWh: ");
        quantidadekWh = leitor.nextInt();

        if(tipoCliente == 'a' || tipoCliente == 'A'){
            valorkWh = 0.60;
        } else if (tipoCliente == 'b' || tipoCliente == 'B') {
            valorkWh = 0.48;
        } else if (tipoCliente == 'c' || tipoCliente == 'C') {
            valorkWh = 1.29;
        } else {
            System.out.println("Tipo inválido!");
            return;
        }

        valorTotal = valorkWh * quantidadekWh;

        System.out.printf("Valor total: R$ %.2f\n", valorTotal);
    }
}