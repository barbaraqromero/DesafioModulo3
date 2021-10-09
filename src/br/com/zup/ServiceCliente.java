package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServiceCliente {

  //Criando lista de clientes
  private static List<Cliente> listaDeClientes = new ArrayList<>();

  //Método para cadastrar cliente
  public static Cliente cadastrarCliente(String nome, String email, String cpf, String telefone) throws Exception {
    validarEmailCliente(email);
    verificarEmailCliente(email);
    verificarCpfCliente(cpf);
    Cliente cliente = new Cliente(nome, email, cpf, telefone);
    listaDeClientes.add(cliente);
    return cliente;
  }

  //Método para exibir cliente
  public static List<Cliente> exibirClientes() {
    List<Cliente> clientesCadastrados = new ArrayList<>();
    for (Cliente clienteReferencia : listaDeClientes) {
      clientesCadastrados.add(clienteReferencia);
      System.out.println(clienteReferencia);
    }
    return clientesCadastrados;
  }

  //Método para validar email do cliente com @
  public static void validarEmailCliente(String email) throws Exception {
    if (!email.contains("@")) {
      throw new Exception("E-mail inválido! Necessita de um @.");

    }
  }

  //Método para verificar se o email do cliente já está cadastrado
  public static void verificarEmailCliente(String email) throws Exception {
    for (Cliente clienteReferencia : listaDeClientes) {
      if (clienteReferencia.getEmail().equals(email)) {
        throw new Exception("E-mail já cadastrado no sistema!");
      }
    }

  }

  //Método para verificar se o cpf do cliente já está cadastrado
  public static void verificarCpfCliente(String cpf) throws Exception {
    for (Cliente clienteReferencia : listaDeClientes) {
      if (clienteReferencia.getCpf().equals(cpf)) {
        throw new Exception("CPF já cadastrado no sistema!");
      }
    }
  }

  public static Cliente pesquisarClientePorEmail(String email) throws Exception{
    for (Cliente clienteReferencia : listaDeClientes){
      if (clienteReferencia.getEmail().equalsIgnoreCase(email)){
        return clienteReferencia;
      }
    }
    throw new Exception("CPF não encontrado!");
  }

}
