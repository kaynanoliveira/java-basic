public class Pessoa {
    // Atributos
    private float altura;
    private float peso;

    // Construtor
    public Pessoa(float peso, float altura){
        this.altura = altura;
        this.peso = peso;
    }

    public float calcularIMC(){
        float imc = peso / (altura * altura);
        return imc;
    }
    // Setter altera o valor de um atributo privado.
    public void setPeso(float peso){
        this.peso = peso;
    }
    // Getter retorna o valor de um atributo privado.
    public float getPeso(){
        return peso;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }

    public float getAltura(){
        return altura;
    }
}