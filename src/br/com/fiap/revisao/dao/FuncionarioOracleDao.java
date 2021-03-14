package br.com.fiap.revisao.dao;

import br.com.fiap.revisao.bean.Funcionario;

import java.util.List;

public class FuncionarioOracleDao implements FuncionarioDao {

    @Override
    public void cadastrar(Funcionario funcionario) {
        System.out.println("Cadastrando no oracle");
    }

    @Override
    public List<Funcionario> listar() {
        System.out.println("Pesquisando no oracle");
        return null;
    }
}
