package exercíciosPoo12Junho.carro;

public class Carro {
    int quantidadePortas;
    String modelo;
    String marca;
    double potencia;
boolean ligado = false;
public Carro(int quantidadePortas, String modelo, String marca, double potencia){
    this.quantidadePortas = quantidadePortas;
    this.modelo = modelo;
    this.marca = marca;
    this.potencia = potencia;
}
public boolean estaLigado () {
    if (ligado) {
        System.out.println("o carro agora está ligado");

        return true;
    } else {
        return false;
    }
}
public void ligarCarro(){
    ligado = true;
}
}
