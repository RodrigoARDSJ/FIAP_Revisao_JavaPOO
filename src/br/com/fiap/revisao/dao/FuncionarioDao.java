package br.com.fiap.revisao.dao;

import br.com.fiap.revisao.bean.Funcionario;

import java.util.List;

public interface FuncionarioDao {
    void cadastrar(Funcionario funcionario);

        List<Funcionario> listar();


}
