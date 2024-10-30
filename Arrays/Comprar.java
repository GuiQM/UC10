package Arrays;

import java.util.Scanner;
import java.util.ArrayList;

public class Comprar {

    Scanner scanner = new Scanner(System.in);
    ArrayList<Produto> estoque = new ArrayList<>();
    ArrayList<Produto> carrinho = new ArrayList<>();
    int dinheiro = 400;

    public Comprar() {
        estoque.add(new Limpeza("Sabonete", 15, "01/2025"));
        estoque.add(new Cosmetico("Perfume", 150, "02/2028"));
        estoque.add(new Roupa("Camisa", 80, "Undefined"));
        estoque.add(new Bebida("Agua", 5, "Undefined"));
        estoque.add(new Alimento("Alface", 6, "11/2024"));
    }

    public void menuInicial() {
        boolean executar = true;
        while (executar) {
            System.out.println("Selecione o que deseja fazer:");
            System.out.println("1. Adicionar produto ao carrinho");
            System.out.println("2. Visualizar carrinho");
            System.out.println("3. Remover produto do carrinho");
            System.out.println("4. Finalizar compra");
            int resposta = scanner.nextInt();
            
           switch(resposta){
               case 1:
                   adicionarAoCarrinho();
                   break;
                   
               case 2:
                   visualizarCarrinho();
                   break;
                   
               case 3:
                   removerProduto();
                   break;
                   
               case 4:
                     pagar();
                   break;

               default:
                   System.out.println("Error");
                   break;
           }
        }
    }

    public void adicionarAoCarrinho() {
        System.out.println("Selecione o que deseja adicionar ao carrinho: ");
        
        for (int i = 0; i < estoque.size(); i++) {
            System.out.println("indice:  " + i);
            estoque.get(i).getProduto();
        }
        int selecionarIndice = scanner.nextInt();

        for (int i = 0; i < estoque.size(); i++) {
            if (i == selecionarIndice) {
                System.out.println(estoque.get(i).nome + " adicionado ao carrinho!");
                carrinho.add(estoque.get(i));
            }
        }
  int retorno = 0;
        for (Produto produto : carrinho) {
            retorno += produto.preco;
        }
        System.out.println("Total a pagar:" + retorno);
        System.out.println("Saldo após a compra: R$" + (dinheiro - retorno) + ",00");
    }

    public void visualizarCarrinho() {
        for (Produto produto : carrinho) {
            produto.getProduto();
        }
    }

    public void removerProduto() {
        System.out.println("Selecione o que deseja remover do carrinho: ");
        
        for (int i = 0; i < carrinho.size(); i++) {
            System.out.println("Indice: " + i);
            carrinho.get(i).getProduto();
            carrinho.remove(estoque.get(i));
        }

        int resposta = scanner.nextInt();
        
        for(int i = 0; i < carrinho.size();  i++){
        if(i == resposta){
        carrinho.remove(carrinho.get(i));
        }
        }
        System.out.println("Produto removido com sucesso!");
    }

    public void pagar() {
        if (dinheiro > totalCarrinho()) {
            System.out.println("Compra bem sucedida!");
            int dinheiroAtual = dinheiro - totalCarrinho();
            dinheiro = dinheiroAtual;
        } else {
            System.out.println("Não possui dinheiro suficiente.");
        }
    }

    public int totalCarrinho() {
        int retorno = 0;
        for (Produto produto : carrinho) {
            retorno += produto.preco;
        }
        return retorno;
    }
}
