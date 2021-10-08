package br.com.zup;

public class Main {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Barbara", "bqromero@gmail.com", "36871421831", "Mastercard");
        Cliente cliente2 = new Cliente("Maicon", "maicon@maicon", "35987451233", "Visa");
        Vendedor vendedor1 = new Vendedor("Antonio", "antonio@antonio", "32569878421", "555");

        System.out.println(ServiceCliente.cadastrarCliente("Ana", "ana@ana", "23698754622", "Visa"));


        System.out.println(ServiceVenda.cadastrarVenda(cliente1, vendedor1, 500, "08/10/2021"));
        System.out.println(ServiceVenda.cadastrarVenda(cliente2, vendedor1, 250, "09/10/2021"));

    }
}
