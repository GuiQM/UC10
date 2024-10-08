package PaperRockScissors;


import java.util.Scanner;



public class Player {

    private String name;

    public Player() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        this.name = scanner.nextLine();
    }

    public String getName() {
        return name;
    }
}
