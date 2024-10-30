package Arrays;

public class Alimento extends Produto {

    public Alimento(String name, int preco, String validade) {
        super(name, preco, validade);
    }

    @Override
    public void getProduto() {
        System.out.println("Nome: " + nome + ";\nPreco: R$" + preco + ";\nValidade: " + validade + ".");
    }
}
