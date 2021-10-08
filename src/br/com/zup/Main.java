package br.com.zup;

public class Main {

    public static void main(String[] args) {
        try {
            Sistema.exibirMenu();


        } catch (Exception erro) {
            System.out.println(erro.getMessage());
        }
    }
}
