package Arrays;

import java.util.Scanner;

//Usando Java e Scanner, elabore um sistema simples de compras (com uma classe abstrata produtos e pelo menos 5 subclasses de tipos de produtos diferentes).
//Para fazer as compras, deve haver um menu com switch, onde você deve poder adicionar e remover itens do carrinho e fazer o pagamento.



abstract class Produto {
    String nome;
    int preco;
    String validade;
    
    public Produto(String nome, int preco, String validade){
    Scanner scanner = new Scanner(System.in);
    this.nome = nome;
    this.preco = preco;
    this.validade = validade;
    
    }
    abstract void getProduto();
}