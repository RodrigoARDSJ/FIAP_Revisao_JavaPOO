package br.com.fiap.revisao.bean;

public class Funcionario {
    //Mdoficadores de acesso:
    //public -> todos conseguem acessar;
    //private -> Somente a propria classe pode acessar;
    //protectd -> somente classes fihlhos, mesmo pacote;
    //default (package) -> Classe no mesmo pacote;

    //Tipos Primitivos: boolean, byte, short, int, long, char, double, float
    //Valor padrão: números = 0, boolean = false.

    //Tipos de Referencia: String, Funcionario, Empresa
    //valor padrão : null

    //Atributos
    private int id;
    private String nome;
    private int dataNascimento;

    //Métodos
    public Funcionario() {}

    public Funcionario(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public void trabalhar() {
        System.out.println("Funcioanrio trabalhando...");
    }

    public void receberBonificacao() {
        System.out.println("Funcionario recebeu bônus");
    }

    //Sobrecarga --> memso metodo com parametros diferentes
    public void trabalhar(int horas) {
        System.out.println("Trabalhando " + horas);
    }

    public void trabalhar(boolean extra, int horas) {
        System.out.println("Trabalhando " + horas + " extra: " + extra);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
