package br.com.zup;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class ServiceVenda {
  private static List<Venda> listaDeVendas = new ArrayList<>();

  public static Venda cadastrarVenda(Cliente cliente, Vendedor vendedorResponsavel, double valor, String dataDeRegistro) {
    Venda venda = new Venda(cliente, vendedorResponsavel, valor, dataDeRegistro);
    listaDeVendas.add(venda);
    return venda;
  }

  public static List<Venda> exibirVendas() {
    List<Venda> vendasCadastradas = new ArrayList<>();
    for (Venda vendaReferencia : listaDeVendas) {
      vendasCadastradas.add(vendaReferencia);


    }
    return vendasCadastradas;
  }

  public static List<Venda> pesquisarComprasPorCpf(String cpf) {
    List<Venda> comprasPorCpf = new ArrayList<>();
    for (Venda comprasReferencias : listaDeVendas) {
      if (comprasReferencias.getCliente().getCpf().equals(cpf)) {
        comprasPorCpf.add(comprasReferencias);
      }
    }
    return comprasPorCpf;
  }

  public static List<Venda> pesquisarVendasPorEmail (String email){
    List<Venda> vendasPorEmail = new ArrayList<>();
    for (Venda vendasReferencia : listaDeVendas){
      if (vendasReferencia.getVendedorResponsável().getEmail().equals(email)){
        vendasPorEmail.add(vendasReferencia);
      }
    }
    return vendasPorEmail;
  }
}







