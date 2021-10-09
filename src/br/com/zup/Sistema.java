package br.com.zup;

import java.util.List;
import java.util.Scanner;

public class Sistema {

  private static Scanner capturarDados(String mensagem) {
    System.out.println(mensagem);
    return new Scanner(System.in);
  }

  public static void exibirMenu() {
    System.out.println("\n----- VENDAS CORP ----");
    System.out.println("Bem vindes ao nosso sistema!");
    System.out.println("\n\t\tM E N U ");
    System.out.println("\n1 - Cadastrar vendedor");
    System.out.println("2 - Cadastrar cliente");
    System.out.println("3 - Cadastrar venda");
    System.out.println("4 - Consultar lista de vendedores");
    System.out.println("5 - Consultar lista de clientes");
    System.out.println("6 - Consultar lista de vendas");
    System.out.println("7 - Pesquisar compras por CPF do cliente");
    System.out.println("8 - Pesquisar vendas pelo e-mail do vendedor");
    System.out.println("9 - Sair do programa");
  }

  public static Vendedor cadastrarVendedor() throws Exception {
    String nome = capturarDados("Digite o nome do vendedor: ").nextLine();
    String email = capturarDados("Digite o e-mail do vendedor: ").nextLine();
    String cpf = capturarDados("Digite o CPF do vendedor: ").nextLine();
    String ctps = capturarDados("Digite a CTPS: ").nextLine();

    return ServiceVendedor.cadastrarVendedor(nome, email, cpf, ctps);
  }

  public static Cliente cadastrarCliente() throws Exception {
    String nome = capturarDados("Digite o nome do cliente: ").nextLine();
    String email = capturarDados("Digite o e-mail do cliente: ").nextLine();
    String cpf = capturarDados("Digite o CPF do cliente: ").nextLine();
    String telefone = capturarDados("Digite o telefone: ").nextLine();

    return ServiceCliente.cadastrarCliente(nome, email, cpf, telefone);
  }

  public static Venda cadastrarVenda() throws Exception {
    String emailDoCliente = capturarDados("Digite o e-mail do cliente: ").nextLine();
    String emailDoVendedor = capturarDados("Digite o e-mail do vendedor: ").nextLine();
    double valor = capturarDados("Digite o valor da venda (em R$): ").nextDouble();
    String data = capturarDados("Digite a data: ").nextLine();
    System.out.println("---- FORMAS DE PAGAMENTO ----");
    System.out.println(ServiceVenda.exibirFormasDePagamento());
    String formaDePagamento = capturarDados("Digite a forma de pagamento: ").nextLine();

    return ServiceVenda.cadastrarVenda(emailDoCliente, emailDoVendedor, valor, data, formaDePagamento);

  }

  public static List<Venda> pesquisarComprasporCpf() throws Exception {
    String cpf = capturarDados("Digite o CPF que deseja consultar: ").nextLine();
    List<Venda> comprasPorCpf = ServiceVenda.pesquisarComprasPorCpf(cpf);
    return comprasPorCpf;
  }

  public static List<Venda> pesquisarVendasPorEmail() throws Exception {
    String email = capturarDados("Digite o e-mail que deseja consultar: ").nextLine();
    List<Venda> vendasPorEmail = ServiceVenda.pesquisarVendasPorEmail(email);
    return vendasPorEmail;

  }

  public static void executar() throws Exception {
    boolean menu = true;

    while (menu) {
      exibirMenu();
      int opcaoDesejada = capturarDados("Digite a opção desejada: ").nextInt();

      if (opcaoDesejada == 1) {
        cadastrarVendedor();
      }
      else if (opcaoDesejada == 2) {
        cadastrarCliente();
      }
      else if (opcaoDesejada == 3) {
        cadastrarVenda();
      }
      else if (opcaoDesejada == 4) {
        ServiceVendedor.exibirVendedor();
      }
      else if (opcaoDesejada == 5) {
        ServiceCliente.exibirClientes();
      }
      else if (opcaoDesejada == 6) {
        ServiceVenda.exibirVendas();
      }
      else if (opcaoDesejada == 7) {
        pesquisarComprasporCpf();
      }
      else if (opcaoDesejada == 8) {
        pesquisarVendasPorEmail();
      }
      else if (opcaoDesejada == 9) {
        System.out.println("Até logo!");
        menu = false;
      }

    }

  }

}
