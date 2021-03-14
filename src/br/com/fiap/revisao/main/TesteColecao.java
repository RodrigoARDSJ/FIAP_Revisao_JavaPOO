package br.com.fiap.revisao.main;

import br.com.fiap.revisao.bean.Funcionario;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TesteColecao {
    public static void main(String[] args) {
        //Instaciar lista de Funcionario
        List<Funcionario> lista = new ArrayList<Funcionario>();

        //Adicionar dois funcioanrios na lista
        lista.add(new Funcionario(1, "Gabriel"));
        lista.add(new Funcionario(2, "Jonas"));
        Funcionario func = new Funcionario(3,"N");


        // Pode ser tambem
        // Funcionario f = new Funcionario();
        // lista.add(f);

        //Exibir os funcioanrios da lista
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getId() + " " + lista.get(i).getNome());
        }

        System.out.println("----------------------");

        //foreach
        for (Funcionario item : lista) {
            System.out.println(item.getId() + " " + item.getNome());
        }

        //Mapa --> chave,valor
        Map<String, Funcionario> mapa = new HashMap<>();

        //adicionar funcioanrio no mapa
        mapa.put("f1", new Funcionario(1,"Jessica"));
        mapa.put("f2", new Funcionario(2,"Helouise"));

        //recuperar o funcioanrio da chave "f1"
        func = mapa.get("f2");
        System.out.println(func.getId() +  " "  + func.getNome());


    }
}
