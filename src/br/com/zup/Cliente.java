package br.com.zup;

public class Cliente extends Pessoa{
  private String cartao;

  public Cliente(String nome, String email, String cpf, String cartao) {
    super(nome, email, cpf);
    this.cartao = cartao;
  }

  public String getCartao() {
    return cartao;
  }

  public void setCartao(String cartao) {
    this.cartao = cartao;
  }

  @Override
  public String toString() {
    StringBuilder mostrarDados = new StringBuilder();
    mostrarDados.append(super.toString());
    mostrarDados.append("Cartão: " + cartao);
    return mostrarDados.toString();
  }
}
