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
  }

  public static Vendedor cadastrarVendedor() throws Exception {
    String nome = capturarDados("Digite o nome do vendedor: ").nextLine();
    String email = capturarDados("Digite o email do vendedor: ").nextLine();
    String cpf = capturarDados("Digite o cpf do vendedor: ").nextLine();
    String ctps = capturarDados("Digite a CTPS: ").nextLine();

    return ServiceVendedor.cadastrarVendedor(nome, email, cpf, ctps);
  }

  public static Cliente cadastrarCliente() throws Exception {
    String nome = capturarDados("Digite o nome do cliente: ").nextLine();
    String email = capturarDados("Digite o email do cliente: ").nextLine();
    String cpf = capturarDados("Digite o CPF do cliente: ").nextLine();
    String cartao = capturarDados("Digite o cartão: ").nextLine();

    return ServiceCliente.cadastrarCliente(nome, email, cpf, cartao);
  }

  public static Venda cadastrarVenda() throws Exception {
    String cpfDoCliente = capturarDados("Digite o CPF do cliente: ").nextLine();
    String emailDovendedor = capturarDados("Digite o e-mail do vendedor: ").nextLine();
    double valor = capturarDados("Digite o valor da venda (em R$): ").nextDouble();
    String data = capturarDados("Digite a data: ").nextLine();

    return ServiceVenda.cadastrarVenda(cpfDoCliente, emailDovendedor, valor,data);

  }

  public static List <Venda> pesquisarComprasporCpf () throws Exception{
    String cpf = capturarDados("Digite o CPF que deseja consultar: ").nextLine();
    List<Venda> comprasPorCpf = ServiceVenda.pesquisarComprasPorCpf(cpf);
    return comprasPorCpf;
  }

  public static List<Venda> pesquisarVendasPorEmail () throws Exception{
    String email = capturarDados("Digite o e-mail que deseja consultar: ").nextLine();
    List<Venda> vendasPorEmail = ServiceVenda.pesquisarVendasPorEmail(email);
    return vendasPorEmail;
  }


}
