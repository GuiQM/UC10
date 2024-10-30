/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author GUILHERMEQUAIATOMOTA
 */
public class Cosmetico extends Produto{

public Cosmetico(String name, int preco, String validade){
super(name, preco, validade);
}

@Override
    public void getProduto() {
        System.out.println("Nome: " + nome + ";\nPreco: R$" + preco + ";\nValidade: " + validade + ".");
    }
}
