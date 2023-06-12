package exercíciosPoo12Junho.pessoa;

public class TestePessoa {
    public static void main(String[] args) {
Pessoa pessoa = new Pessoa("joão", 12, 48.414, 1.52);
pessoa.idade = 14;

pessoa.peso = 52.650;
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getAltura());
        System.out.println(pessoa.getPeso());
pessoa.envelhecer(3);
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getPeso());
        System.out.println(pessoa.getAltura());

        pessoa.envelhecer(2);
        System.out.println(pessoa.getIdade());
;        System.out.println(pessoa.getAltura());
    }
}
