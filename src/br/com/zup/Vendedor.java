package br.com.zup;

import javax.print.DocFlavor;

public class Vendedor extends Pessoa {
  private String ctps;

  public Vendedor(String nome, String email, String cpf, String ctps) {
    super(nome, email, cpf);
    this.ctps = ctps;
  }

  public String getCtps() {
    return ctps;
  }

  public void setCtps(String ctps) {
    this.ctps = ctps;
  }

  @Override
  public String toString() {
    StringBuilder mostrarDados = new StringBuilder();
    mostrarDados.append(super.toString());
    mostrarDados.append("CTPS: " + ctps);

    return mostrarDados.toString();
  }
}
