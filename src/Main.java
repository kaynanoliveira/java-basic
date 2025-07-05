import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Vendedor v = new Vendedor();
        v.setNome("Kaynan");
        v.setCpf("39492394239");
        v.setDataNascimento(new Date());
        v.setSalario(1000.0f);
        v.setTotalItensVendidos(10);
        v.setComissaoPorItem(5.0f);

        System.out.println("Nome: " + v.getNome());
        System.out.println("Salário calculado: " + v.calcularSalario());
        Motorista m = new Motorista();
    }
}