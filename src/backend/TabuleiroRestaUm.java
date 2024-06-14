package src.backend;

import console.Console;
import cores.Cor;
import cores.StringColorida;
import mecanicas.Carta;
import mecanicas.Tabuleiro;

public class TabuleiroRestaUm extends Tabuleiro {

    StringColorida jogavel = new StringColorida("   ", Cor.VERDE, Cor.FUNDO_BRANCO_BRANCO);
    StringColorida vazio = new StringColorida(" X ", Cor.BRANCO, Cor.FUNDO_PRETO);
    StringColorida peca = new StringColorida(" ⍟ ", Cor.VERMELHO, Cor.FUNDO_BRANCO_BRANCO);
    CartaBaralho cartaJogavel = new CartaBaralho(jogavel);
    CartaBaralho cartaVazio = new CartaBaralho(vazio);
    CartaBaralho cartaPeca = new CartaBaralho(peca);

    public TabuleiroRestaUm(int numLinhas, int numColunas, Carta fundo) {
        super(numLinhas, numColunas, fundo);
    }

    public static void sairDoPrograma() {
        System.exit(0);
    }

    public void novoJogo() {
        Console.limpaTela();
    }

    // Move a peça no tabuleiro tanto verticalmente, quanto horizontalmente
    public void moverPeca(int linhaInicial, int colunaInicial, int linhaFinal, int colunaFinal) {

        int linhaMeio;
        int colunaMeio;

        if (linhaInicial == linhaFinal && colunaFinal == colunaInicial + 2) {  // Movimento horizontal direito
            linhaMeio = linhaFinal;
            colunaMeio = colunaFinal - 1;
            colocaCarta(linhaInicial, colunaInicial, cartaJogavel);
            colocaCarta(linhaFinal, colunaFinal, cartaPeca);
            colocaCarta(linhaMeio, colunaMeio, cartaJogavel);

        } else if (linhaInicial == linhaFinal && colunaFinal == colunaInicial - 2) { // Movimento horizontal esquerdo
            linhaMeio = linhaFinal;
            colunaMeio = colunaFinal + 1;
            colocaCarta(linhaInicial, colunaInicial, cartaJogavel);
            colocaCarta(linhaFinal, colunaFinal, cartaPeca);
            colocaCarta(linhaMeio, colunaMeio, cartaJogavel);

        } else if (colunaInicial == colunaFinal && linhaFinal == linhaInicial + 2) { // Movimento vertical direito
            colunaMeio = colunaFinal;
            linhaMeio = linhaFinal - 1;
            colocaCarta(linhaInicial, colunaInicial, cartaJogavel);
            colocaCarta(linhaFinal, colunaFinal, cartaPeca);
            colocaCarta(linhaMeio, colunaMeio, cartaJogavel);

        } else if (colunaInicial == colunaFinal && linhaFinal == linhaInicial - 2) { // Movimento vertical esquerdo
            colunaMeio = colunaFinal;
            linhaMeio = linhaFinal + 1;
            colocaCarta(linhaInicial, colunaInicial, cartaJogavel);
            colocaCarta(linhaFinal, colunaFinal, cartaPeca);
            colocaCarta(linhaMeio, colunaMeio, cartaJogavel);

        } else {
            Console.println("Jogada Inválida, tente novamente.");
            Console.println("");
        }
    }
}