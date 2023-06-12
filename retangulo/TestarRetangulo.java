package exercíciosPoo12Junho.retangulo;

public class TestarRetangulo {
    public static void main(String[] args) {
Retangulo r = new Retangulo();
r.setarBaseEAutura(10, 20);
r.caucularArea();
        System.out.println("a área do retângulo é igual a: " + r.getArea());
        r.caucularPerimetro();
        System.out.println("o perímetro de um retângulo é de: " + r.getPerimetro());
    }
}
