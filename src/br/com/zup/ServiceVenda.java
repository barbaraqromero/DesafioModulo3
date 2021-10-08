package br.com.zup;

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
}


