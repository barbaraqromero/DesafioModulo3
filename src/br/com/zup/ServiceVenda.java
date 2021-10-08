package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServiceVenda {

  //Criando lista de vendas
  private static List<Venda> listaDeVendas = new ArrayList<>();

  //Criando método para cadastrar venda
  public static Venda cadastrarVenda(String emailCliente, String emailVendedor, double valor, String dataDeRegistro) throws Exception{
    Cliente cliente = ServiceCliente.pesquisarClientePorEmail(emailCliente);
    Vendedor vendedor = ServiceVendedor.pesquisarVendedorPorEmail(emailVendedor);
    Venda venda = new Venda(cliente, vendedor, valor, dataDeRegistro);
    listaDeVendas.add(venda);

    return venda;
  }

  //Criando método para exibir vendas
  public static List<Venda> exibirVendas() {
    List<Venda> vendasCadastradas = new ArrayList<>();
    for (Venda vendaReferencia : listaDeVendas) {
      vendasCadastradas.add(vendaReferencia);
      System.out.println(vendaReferencia);


    }
    return vendasCadastradas;
  }

  //Criando método para pesquisar compras pelo cpf do cliente
  public static List<Venda> pesquisarComprasPorCpf(String cpf) throws Exception {
    List<Venda> comprasPorCpf = new ArrayList<>();
    //ServiceCliente.verificarCpfCliente(cpf);
    for (Venda comprasReferencias : listaDeVendas) {
      if (comprasReferencias.getCliente().getCpf().equals(cpf)) {
        comprasPorCpf.add(comprasReferencias);
        System.out.println(comprasReferencias);
      }
    }
    return comprasPorCpf;
  }

  //Criando método para pesquisar vendas pelo email do vendedor
  public static List<Venda> pesquisarVendasPorEmail (String email) throws Exception{
    List<Venda> vendasPorEmail = new ArrayList<>();
    for (Venda vendasReferencia : listaDeVendas){
      if (vendasReferencia.getVendedorResponsável().getEmail().equals(email)){
        vendasPorEmail.add(vendasReferencia);
      }
    }
    return vendasPorEmail;
  }
}







