package Arrays;

public class Limpeza extends Produto {

    public Limpeza(String name, int preco, String validade) {
        super(name, preco, validade);
    }

    @Override
    public void getProduto() {
        System.out.println("Nome: " + nome + ";\nPreco: R$" + preco + ";\nValidade: " + validade + ".");
    }
}
