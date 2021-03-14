package br.com.fiap.revisao.main;

public class TesteTernario {
    public static void main(String[] args) {
        int x = 10;

        if (x > 10) {
            System.out.println("x é maior que 10");
        } else {
            System.out.println("x não é maior que 10");
        }
        //Ternario
        System.out.println(x>10?"x é maior que 10":"x não é maior que 10");
    }
}
