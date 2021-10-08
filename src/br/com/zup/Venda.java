package br.com.zup;

public class Venda {

  //Criando atributos
  private Cliente cliente;
  private Vendedor vendedorResponsável;
  private double valor;
  private String dataDeRegistro;

  //Criando método construtor
  public Venda(Cliente cliente, Vendedor vendedorResponsável, double valor, String dataDeRegistro) {
    this.cliente = cliente;
    this.vendedorResponsável = vendedorResponsável;
    this.valor = valor;
    this.dataDeRegistro = dataDeRegistro;
  }

  //Criando getters e setters
  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public Vendedor getVendedorResponsável() {
    return vendedorResponsável;
  }

  public void setVendedorResponsável(Vendedor vendedorResponsável) {
    this.vendedorResponsável = vendedorResponsável;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public String getDataDeRegistro() {
    return dataDeRegistro;
  }

  public void setDataDeRegistro(String dataDeRegistro) {
    this.dataDeRegistro = dataDeRegistro;
  }

  //Criando toString
  @Override
  public String toString() {
    StringBuilder mostrarDados = new StringBuilder();
    mostrarDados.append("\nCliente: " + cliente);
    mostrarDados.append("\nVendedor responsável: " + vendedorResponsável);
    mostrarDados.append("\nValor da venda: " + valor);
    mostrarDados.append("\nData de registro: " + dataDeRegistro);

    return mostrarDados.toString();
  }
}
