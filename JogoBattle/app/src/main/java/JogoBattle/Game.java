package JogoBattle;

import java.util.Scanner;

public class Game {

    private Scanner scanner;
    public Mago mago = new Mago("Julio");
    public Guerreiro guerreiro = new Guerreiro("Fernando");
    public Arqueiro arqueiro = new Arqueiro("Robin");

    public Game() {
        this.scanner = new Scanner(System.in);

    }

    public void escolherPersonagem() {

        System.out.println("Selecione o seu personagem: ");
        System.out.println("1- MAGO (ATK: 25 - HP: 80)");
        System.out.println("2- GUERREIRO (ATK25 - HP: 100)");
        System.out.println("3- ARQUEIRO (ATK: 20 - HP: 90)");
        int choosePerson = scanner.nextInt();
        Personagem atacante;

        switch (choosePerson) {
            case 1:
                System.out.println("Você escolheu Mago");
                atacante = mago;
                break;
            case 2:
                System.out.println("Você escolheu Guerreiro");
                atacante = guerreiro;
                break;

            case 3:
                System.out.println("Você escolheu Arqueiro");
                atacante = arqueiro;
                break;

            default:
                System.out.println("Selecione um número válido");
                break;
        }
    }

    public void escolherOponente() {
        System.out.println("Agora selecione o seu oponente: ");
        System.out.println("1-MAGO (HP Inicial: " + 80 + ")");
        System.out.println("2- GUERREIRO (HP Inicial: " + 100 + ")");
        System.out.println("3- ARQUEIRO (HP Inicial: " + 90 + ")");

        int chooseOpponent = scanner.nextInt();
        Personagem oponente;

        switch (chooseOpponent) {
            case 1:
                System.out.println("Você escolheu Mago");
                oponente = mago;
                break;
            case 2:
                System.out.println("Você escolheu Guerreiro");
                oponente = guerreiro;
                break;

            case 3:
                System.out.println("Você escolheu Arqueiro");
                oponente = arqueiro;
                break;
            default:
                System.out.println("Selecione um número válido");
                break;
        }
    }

    public void luta(Personagem oponente) {
        while (oponente.estaVivo()) {
            escolherPersonagem();
            escolherOponente();
        }
    }
}
