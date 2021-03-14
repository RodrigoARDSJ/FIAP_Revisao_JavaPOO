package br.com.fiap.revisao.main;

import br.com.fiap.revisao.bean.Funcionario;
import br.com.fiap.revisao.bean.Gerente;

public class TesteMain {
    public static void main(String[] args) {

        //Instanciar um funcionario
        Funcionario funcionario = new Funcionario();

        //chamar o método Bonificação
        funcionario.receberBonificacao();

        //instanciar gerente
        Gerente gerente = new Gerente();

        //chamar o método Bonificação
        gerente.receberBonificacao();

        //Criando um objeto Gerente e atribuindo para uma vareavel de Funcionario
        Funcionario f = new Gerente();
        f.receberBonificacao(); // Gerente

        // Gerente f = new Funcioanrio(); Não Funciona
    }
}
