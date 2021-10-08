package br.com.zup;

import java.util.Scanner;

public class Sistema {

  private static Scanner capturarDados (String mensagem){
    System.out.println(mensagem);
    return new Scanner(System.in);
  }

  public static void exibirMenu(){
    System.out.println("\n----- VENDAS CORP ----");
    System.out.println("Bem vindes ao nosso sistema!");
    System.out.println("\n\t\tM E N U ");
    System.out.println("1 - Cadastrar vendedor");
    System.out.println("2 - Cadastrar cliente");
    System.out.println("3 - Cadastrar venda");
  }



}
