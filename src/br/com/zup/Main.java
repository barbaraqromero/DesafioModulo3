package br.com.zup;

public class Main {

  public static void main(String[] args) {
    boolean continuar = true;
    while (continuar = true) {
      try {
        continuar = Sistema.executar();


      } catch (Exception erro) {
        System.out.println(erro.getMessage());
      }
    }

  }
}
