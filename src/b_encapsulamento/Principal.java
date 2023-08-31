package b_encapsulamento;

public class Principal {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.nome = "joloo";
        p.idade = -10;
        System.out.println(p.nome + " - " + p.idade);
    }
    
}