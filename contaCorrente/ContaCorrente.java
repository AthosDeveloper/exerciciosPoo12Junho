package exercíciosPoo12Junho.contaCorrente;

public class ContaCorrente {
    int numeroConta;
    String nome;
    double saldo;

    public ContaCorrente(int numeroConta, String nome, double saldo) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = saldo;
    }

    public void sacarConta(double saldo) {

        this.saldo -= saldo;
    }

    public double getSaldo() {
        if (saldo < 0) {
            System.out.println("Saldo insuficiente");
        }
            return saldo;
        }
    public void depositarConta(double saldo){
    this.saldo += saldo;

}

}

