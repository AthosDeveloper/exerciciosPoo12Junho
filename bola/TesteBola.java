package exercíciosPoo12Junho.bola;

public class TesteBola {
    public static void main(String[] args) {
        Bola bola = new Bola();
        bola.cor = "azul";
        System.out.println(bola.mostrarCor());
        bola.trocarCor("verde");
        System.out.println(bola.mostrarCor());
        Bola bola1 = new Bola();
        bola1.cor= "roxo";
        System.out.println("a cor atual é: " + bola1.cor);
    bola1.trocarCor("amarelo");
    }
}

