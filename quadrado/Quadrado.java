package exercíciosPoo12Junho.quadrado;

public class Quadrado {
    double tamanhoLado;
    double area;
public void insereLado(double tamanhoLado){
    this.tamanhoLado = tamanhoLado;
}

    public double getTamanhoLado() {
         return  tamanhoLado;
}
public  void caucularArea(){
    area = tamanhoLado * tamanhoLado;
}
public double getArea(){
    return area;
}


}
