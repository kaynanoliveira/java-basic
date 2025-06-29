public class Pessoa {
    // Atributos
    float altura;
    float peso;

    public float calcularIMC(){
        float imc = peso / (altura * altura);
        return imc;
    }
}
