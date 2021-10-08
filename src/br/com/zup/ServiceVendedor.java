package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServiceVendedor {
  private static List<Vendedor> listaDeVendedores = new ArrayList<>();

  public static Vendedor cadastrarVendedor(String nome, String email, String cpf, String ctps) throws Exception {
    validarEmailVendedor(email);
    verificarEmailVendedor(email);
    Vendedor vendedor = new Vendedor(nome, email, cpf, ctps);
    listaDeVendedores.add(vendedor);
    return vendedor;

  }

  public static List<Vendedor> exibirVendedor() {
    List<Vendedor> vendedoresCadastrados = new ArrayList<>();
    for (Vendedor vendedorReferencia : listaDeVendedores) {
      vendedoresCadastrados.add(vendedorReferencia);
    }
    return vendedoresCadastrados;

  }

  public static void validarEmailVendedor(String email) throws Exception {
    if (!email.contains("@")) {
      throw new Exception("E-mail inválido!");

    }


  }

  public static void verificarEmailVendedor(String email) throws Exception {
    for (Vendedor vendedorReferencia : listaDeVendedores) {
      if (vendedorReferencia.getEmail().equals(email)) {
        throw new Exception("E-mail já cadastrado!");
      }
    }

  }
}

