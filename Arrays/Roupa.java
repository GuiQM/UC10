package Arrays;


public class Roupa extends Produto {

    public Roupa(String name, int preco, String validade) {
        super(name, preco, validade);
    }

    @Override
    public void getProduto() {
        System.out.println("Nome: " + nome + ";\nPreco: R$" + preco + ";\nValidade: " + validade + ".");
    }
}
