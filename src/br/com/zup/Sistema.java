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

  public static Vendedor cadastrarVendedor() throws Exception{
    String nome = capturarDados("Digite o nome do vendedor: ").nextLine();
    String email = capturarDados("Digite o email do vendedor: ").nextLine();
    String cpf = capturarDados("Digite o cpf do vendedor: ").nextLine();
    String ctps = capturarDados("Digite a CTPS: ").nextLine();

    return ServiceVendedor.cadastrarVendedor(nome, email, cpf, ctps);
  }

  public static Cliente cadastrarCliente() throws Exception{
    String nome = capturarDados("Digite o nome do cliente: ").nextLine();
    String email = capturarDados("Digite o email do cliente: ").nextLine();
    String cpf = capturarDados("Digite o CPF do cliente: ").nextLine();
    String cartao = capturarDados("Digite o cartão: ").nextLine();

    return ServiceCliente.cadastrarCliente(nome, email, cpf, cartao);
  }



}
