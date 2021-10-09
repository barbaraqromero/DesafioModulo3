package br.com.zup;

public class Cliente extends Pessoa{

  //Criando atributos
  private String telefone;

  //Criando método construtor
  public Cliente(String nome, String email, String cpf, String telefone) {
    super(nome, email, cpf);
    this.telefone = telefone;
  }

  //Criando getters e setters
  public String getCartao() {
    return telefone;
  }

  public void setCartao(String telefone) {
    this.telefone = telefone;
  }

  //Criando toString
  @Override
  public String toString() {
    StringBuilder mostrarDados = new StringBuilder();
    mostrarDados.append(super.toString());
    mostrarDados.append("\nTelefone: " + telefone);

    return mostrarDados.toString();
  }
}
