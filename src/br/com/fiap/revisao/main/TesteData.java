package br.com.fiap.revisao.main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TesteData {
    public static void main(String[] args) {
        //Instanciar um objeto de data com  a data atual
        Calendar hoje = Calendar.getInstance();
        //Formartar Data

        //Instanciar um objeto de data com  a data da entrega da challenge
        Calendar challange = new GregorianCalendar(2021, Calendar.MAY, 15, 23, 30);
        SimpleDateFormat formartador = new SimpleDateFormat("dd/MM/yyyy HH:MM");
        //Exibir data
        System.out.println(formartador.format(hoje.getTime()));
        System.out.println(challange.getTime());
    }
}
