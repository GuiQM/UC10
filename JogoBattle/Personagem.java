package JogoBattle;

public class Personagem {

    public String nome;
    public int vida;
    public int ataque;

    public Personagem(String nome, int vida, int ataque) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
    }

    public String atacar(Personagem oponente) {
        int danoRecebido = (oponente.vida - this.ataque);

        return "O " + oponente + " ficou com " + vida + " de HP.";
    }

    public boolean estaVivo() {

        if (this.vida > 0) {
            return true;
        } else {
            return false;
          }
    }
}
