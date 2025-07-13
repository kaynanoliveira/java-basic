import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class exercicio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        NumberFormat formatador = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        int nivel;
        int horasTrabalhadas;
        double salarioTotal;
        double valorHora;

        System.out.print("Digite quantas horas ele trabalha: ");
        horasTrabalhadas = leitor.nextInt();

        System.out.print("Digite o nivel do professor (1, 2 ou 3): ");
        nivel = leitor.nextInt();

        switch (nivel){
            case 1:
                valorHora = 12.0;
                break;
            case 2:
                valorHora = 17.0;
                break;
            case 3:
                valorHora = 25.0;
                break;
            default:
                System.out.println("Nível inválido!!");
                return;
        }
        salarioTotal = valorHora * horasTrabalhadas;

        System.out.println("Salário final: " + formatador.format(salarioTotal));
    }
}