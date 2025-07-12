import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double salarioMinimo = 1518.00;
        double salarioAtual = 0;
        double calculoPorcentagem = 0;
        double novoSalario;
        double totalReajuste = 0;
        String nome;

        for (int i = 0; i <= 4; i++) {

            System.out.print("Digite o nome do funcionário: ");
            nome = leitor.nextLine();

            System.out.print("Digite seu salário atual em reais: ");
            salarioAtual = leitor.nextDouble();
            leitor.nextLine();

            if (salarioAtual < 3 * salarioMinimo) {
                System.out.println("Faixa: Menos de 3 salários mínimos (reajuste de 50%)");
                calculoPorcentagem = salarioAtual * 0.50;
            } else if (salarioAtual >= 3 * salarioMinimo && salarioAtual <= 10 * salarioMinimo) {
                System.out.println("Faixa: Entre 3 até 10 salários mínimos (reajuste de 20%)");
                calculoPorcentagem = salarioAtual * 0.20;
            } else if (salarioAtual >= 10 * salarioMinimo && salarioAtual <= 20 * salarioMinimo) {
                System.out.println("Faixa: Entre 10 até 20 salários mínimos (reajuste de 15%)");
                calculoPorcentagem = salarioAtual * 0.15;
            } else {
                System.out.println("10% Para os demais funcionários");
                calculoPorcentagem = salarioAtual * 0.10;
            }
            System.out.println("============================================");
            novoSalario = salarioAtual + calculoPorcentagem;
            totalReajuste += calculoPorcentagem;

            System.out.println("Nome do funcionário: " + nome);
            System.out.println("Total de aumento na folha de pagamento: " + totalReajuste);
            System.out.println("Novo salário: " + novoSalario);
            System.out.println("============================================");
        }
    }
}