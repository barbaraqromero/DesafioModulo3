package br.com.zup;

public abstract class Pessoa {

  //Criando atributos
  private String nome;
  private String email;
  private String cpf;

  //Criando método construtor
  public Pessoa(String nome, String email, String cpf) {
    this.nome = nome;
    this.email = email;
    this.cpf = cpf;
  }

  //Criando getters e setters
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  //Criando toString
  @Override
  public String toString() {
    StringBuilder mostrarDados = new StringBuilder();
    mostrarDados.append("\nNome: " + nome);
    mostrarDados.append("\nEmail: " + email);
    mostrarDados.append("\nCPF: " + cpf);

    return mostrarDados.toString();
  }
}
