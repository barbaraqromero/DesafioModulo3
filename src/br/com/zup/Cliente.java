package br.com.zup;

public class Cliente extends Pessoa{

  //Criando atributos
  private String cartao;

  //Criando método construtor
  public Cliente(String nome, String email, String cpf, String cartao) {
    super(nome, email, cpf);
    this.cartao = cartao;
  }

  //Criando getters e setters
  public String getCartao() {
    return cartao;
  }

  public void setCartao(String cartao) {
    this.cartao = cartao;
  }

  //Criando toString
  @Override
  public String toString() {
    StringBuilder mostrarDados = new StringBuilder();
    mostrarDados.append(super.toString());
    mostrarDados.append("\nCartão: " + cartao);

    return mostrarDados.toString();
  }
}
