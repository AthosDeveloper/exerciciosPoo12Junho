package exercíciosPoo12Junho.contaCorrente;

public class TesteContaCorrente {
    public static void main(String[] args) {


        ContaCorrente cc = new ContaCorrente(456, "fernando", 552.500);
cc.depositarConta(900);
        System.out.println(cc.getSaldo());
        cc.sacarConta(450);
        System.out.println(cc.getSaldo());
        cc.sacarConta(500);
        System.out.println(cc.getSaldo());
        cc.sacarConta(900);
        System.out.println(cc.getSaldo());

    }
}

