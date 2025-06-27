import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeProduto;
        float precoCusto;
        float precoVenda;

        float totalCusto = 0.0f;
        float totalVenda = 0.0f;

        int i = 0;
        for (; i < 3; i++) {

            System.out.print("Digite o nome do produto: ");
            nomeProduto = scanner.next();

            System.out.print("Digite o preço de custo: ");
            precoCusto = scanner.nextFloat();

            System.out.print("Digite o preço de venda: ");
            precoVenda = scanner.nextFloat();

            totalVenda += precoVenda;
            totalCusto += precoCusto;

            if (precoCusto == precoVenda) {
                System.out.println("Houve um empate");
            } else if (precoCusto > precoVenda) {
                System.out.println("Prejuizo");
            } else {
                System.out.println("Lucro");
            }
            System.out.println(nomeProduto + " | Preço de custo = "
                    + precoCusto + " | Preço de venda = " + precoVenda);
        }

        System.out.println("A média de preço de custo R$: " + (totalCusto / i));
        System.out.println("A média de preço de venda R$: " + (totalVenda / i));
    }
}
