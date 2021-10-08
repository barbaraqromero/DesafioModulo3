package br.com.zup;

public class Main {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Barbara", "bqromero@gmail.com", "36871421831", "Mastercard");
        Vendedor vendedor1 = new Vendedor("Antonio", "antonio@antonio", "32569878421", "555");


        System.out.println(ServiceVenda.cadastrarVenda(cliente1, vendedor1, 500, "08/10/2021"));

    }
}
