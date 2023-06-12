package exercíciosPoo12Junho.retangulo;

public class Retangulo {
    double base;
    double altura;
    double perimetro;
    public double getPerimetro(){
        return  perimetro;
    }
    double area;
public void setarBaseEAutura(double base, double altura){
    this.base = base;
    this.altura = altura;
}

    public double getAltura() {
        return altura;
    }
    public double getBase(){
    return  base;

    }
    public  double getArea(){
    return  area;
    }
public  void caucularArea(){
    area = base * altura;
}
public  void caucularPerimetro(){
    perimetro = 2 * (base + altura);
}
}
