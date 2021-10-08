package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServiceVendedor {
  private static List<Vendedor> listaDeVendedores = new ArrayList<>();

  public static Vendedor cadastrarVendedor (String nome, String email, String cpf, String ctps){
    Vendedor vendedor = new Vendedor(nome, email, cpf, ctps);
    listaDeVendedores.add(vendedor);
    return vendedor;

  }
}
