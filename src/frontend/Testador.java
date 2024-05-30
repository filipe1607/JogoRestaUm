package src.frontend;

import console.Console;
import cores.Cor;
import cores.StringColorida;
import mecanicas.Tabuleiro;

public class Testador {
    public static void main(String[] args) {
        StringColorida jogavel = new StringColorida(" \u008A ", Cor.VERDE, Cor.FUNDO_PRETO);
        StringColorida vazio = new StringColorida("   ", Cor.PRETO, Cor.FUNDO_PRETO);
        CartaBaralho cartaJogavel = new CartaBaralho(jogavel);
        CartaBaralho cartaVazio = new CartaBaralho(vazio);
        Tabuleiro restaUm = new TabuleiroLipe(7, 7, cartaJogavel);

        restaUm.setFundo(0, 0, cartaVazio);
        restaUm.setFundo(0, 1, cartaVazio);
        restaUm.setFundo(1, 0, cartaVazio);
        restaUm.setFundo(1, 1, cartaVazio);

        restaUm.setFundo(0, 5, cartaVazio);
        restaUm.setFundo(0, 6, cartaVazio);
        restaUm.setFundo(1, 5, cartaVazio);
        restaUm.setFundo(1, 6, cartaVazio);

        restaUm.setFundo(5, 0, cartaVazio);
        restaUm.setFundo(5, 1, cartaVazio);
        restaUm.setFundo(6, 0, cartaVazio);
        restaUm.setFundo(6, 1, cartaVazio);

        restaUm.setFundo(5, 5, cartaVazio);
        restaUm.setFundo(5, 6, cartaVazio);
        restaUm.setFundo(6, 5, cartaVazio);
        restaUm.setFundo(6, 6, cartaVazio);

        restaUm.setFundo(3, 3, cartaVazio);


        Console.println(restaUm);
    }
}