import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = leitorScanner.nextInt();

        if(numero > 10){
            System.out.print("O número é maior que 10");
        }else if(numero == 10){
            System.out.print("O número é igual a 10");
        }else{
            System.out.print("O número é menor que 10");
        }

    }
}
