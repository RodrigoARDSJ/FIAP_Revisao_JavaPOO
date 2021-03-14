package br.com.fiap.revisao.main;

import br.com.fiap.revisao.bean.Funcionario;
import br.com.fiap.revisao.dao.FuncionarioDao;
import br.com.fiap.revisao.dao.FuncionarioMysqlDao;
import br.com.fiap.revisao.dao.FuncionarioOracleDao;

public class TesteInterface {
    public static void main(String[] args) {
        //Instaciar um objeto do tipo FuncionarioDao
        FuncionarioDao dao = new FuncionarioOracleDao();
        dao.cadastrar(new Funcionario());

        FuncionarioDao daoMysql = new FuncionarioMysqlDao();
        daoMysql.cadastrar(new Funcionario());
    }
}
