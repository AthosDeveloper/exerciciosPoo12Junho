package exercíciosPoo12Junho.carro;

public class TestarCarro {
    public static void main(String[] args) {
        Carro carro = new Carro(2, "gol", "Volkswagen", 2.0);
        carro.ligarCarro();
        carro.estaLigado();
Carro carro2 = new Carro(4, "toyota", "toyota motor corporation", 2.0);
carro2.ligarCarro();
        carro2.estaLigado();
    }

}