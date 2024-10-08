package PaperRockScissors;

import java.util.Scanner;

public class Game {
    private int chooseBot;
    private int choosePlayer;
    private Player player;
    private Scanner scanner;


public Game() {
        this.chooseBot = (int) (Math.random() * 3) + 1;
        System.out.println("1-Pedra|2-Papel|3-Tesoura");
        this.choosePlayer = scanner.nextInt();
        this.player = new Player();
        this.scanner = new Scanner(System.in);

    }

public void start() {
System.out.println("Bem-vindo ao Paper, Rock'n Scissors " + player.getName() + "!");

if (choosePlayer == 1 & chooseBot == 1) {
    System.out.println("Empate");
    
        }else if (choosePlayer == 1 & chooseBot == 2){
        System.out.println("Voce venceu!");
        
        }else if(choosePlayer == 1 & chooseBot == 3){
        System.out.println("Bot venceu! Seu ruim kkk");
        
        }else if (choosePlayer == 2 & chooseBot == 1){
        System.out.println("Voce venceu!");
        
        }else if (choosePlayer == 2 & chooseBot == 2){
        System.out.println("Empate");
            
        }else if (choosePlayer == 2 & chooseBot == 3){
        System.out.println("Bot venceu! Seu ruim kkk");
        
        }else if (choosePlayer == 3 & chooseBot == 1){
        System.out.println("Bot venceu! Seu ruim kkk");
        
        }else if (choosePlayer == 3 & chooseBot == 2){
        System.out.println("Voce venceu!");        
        
        }else if (choosePlayer == 3 & chooseBot == 3){
        System.out.println("Empate");
        }
    }
}