package exercíciosPoo12Junho.bola;

public class Bola {
    double circunferencia;
    String cor;
String marca;
String material;
int velocidade;
public void trocarCor(String cor){
this.cor = cor;
    System.out.println("a cor atual da bola é: " + cor);
}
public String mostrarCor(){
    return cor;
}
}
