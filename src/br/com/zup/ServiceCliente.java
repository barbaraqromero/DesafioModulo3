package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServiceCliente {
  private static List<Cliente> listaDeClientes = new ArrayList<>();

  public static Cliente cadastrarCliente(String nome, String email, String cpf, String cartao) {
    Cliente cliente = new Cliente(nome, email, cpf, cartao);
    listaDeClientes.add(cliente);
    return cliente;
  }

  public static List<Cliente> exibirClientes() {
    List<Cliente> clientesCadastrados = new ArrayList<>();
    for (Cliente clienteReferencia : listaDeClientes) {
      clientesCadastrados.add(clienteReferencia);
    }
    return clientesCadastrados;
  }

  public static void validarEmailCliente(String email) throws Exception {
    if (!email.contains("@")) {
      throw new Exception("E-mail inválido!");

    }

  }
}
