package br.com.zup;

import javax.print.DocFlavor;

public class Vendedor extends Pessoa {

  //Criando atributos
  private String ctps;

  //Criar método construtor
  public Vendedor(String nome, String email, String cpf, String ctps) {
    super(nome, email, cpf);
    this.ctps = ctps;
  }


  //Criar getters e setters
  public String getCtps() {
    return ctps;
  }

  public void setCtps(String ctps) {
    this.ctps = ctps;
  }

  //Criar toString
  @Override
  public String toString() {
    StringBuilder mostrarDados = new StringBuilder();
    mostrarDados.append(super.toString());
    mostrarDados.append("\nCTPS: " + ctps);

    return mostrarDados.toString();
  }
}
