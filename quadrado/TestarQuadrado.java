package exercíciosPoo12Junho.quadrado;

public class TestarQuadrado {
    public static void main(String[] args) {
        Quadrado q = new Quadrado();
        q.insereLado(10);
        q.getTamanhoLado();
        q.caucularArea();
        System.out.println("a área do quadrado é de: " + q.getArea());
    }
}
