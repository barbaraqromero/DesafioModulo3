package br.com.zup;

import java.util.Date;

public class Venda {
  private Cliente cliente;
  private Vendedor vendedorResponsável;
  private double valor;
  private String dataDeRegistro;

  public Venda(Cliente cliente, Vendedor vendedorResponsável, double valor, String dataDeRegistro) {
    this.cliente = cliente;
    this.vendedorResponsável = vendedorResponsável;
    this.valor = valor;
    this.dataDeRegistro = dataDeRegistro;
  }

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
