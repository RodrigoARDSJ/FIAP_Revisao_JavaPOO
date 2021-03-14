package br.com.fiap.revisao.dao;

import br.com.fiap.revisao.bean.Funcionario;

import java.util.List;

public class FuncionarioMysqlDao implements FuncionarioDao{
    @Override
    public void cadastrar(Funcionario funcionario) {
        System.out.println("Casdastrando no MySQl");
    }

    @Override
    public List<Funcionario> listar() {
        System.out.println("Pesquisando no MySQl");
        return null;
    }
}
