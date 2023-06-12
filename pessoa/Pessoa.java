package exercíciosPoo12Junho.pessoa;



public class Pessoa {
    String nome;
    double pegaPorcentagemAltura = 0.05;
    int idade;
    double peso;
    double altura;
    public Pessoa(String nome, int idade, double peso, double altura){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }
    public void envelhecer (int idade) {
        this.idade += idade;
if (this.idade < 21){
    altura += pegaPorcentagemAltura;
}
    }
public void engordar(double peso){
        this.peso += peso;

}
public void emagrecer(double peso){
        this.peso -= peso;
}
public void crescer(double altura){
        this.altura += altura;
}

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
}
