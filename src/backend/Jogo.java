package src.backend;

import console.Console;
import cores.Cor;
import cores.StringColorida;

public class Jogo {
    private TabuleiroRestaUm tabuleiroRestaUm;

    public Jogo() {
        StringColorida jogavel = new StringColorida("   ", Cor.VERDE, Cor.FUNDO_BRANCO_BRANCO);
        StringColorida vazio = new StringColorida(" X ", Cor.BRANCO, Cor.FUNDO_PRETO);
        StringColorida peca = new StringColorida(" ⍟ ", Cor.VERMELHO, Cor.FUNDO_BRANCO_BRANCO);

        CartaBaralho cartaJogavel = new CartaBaralho(jogavel);
        CartaBaralho cartaVazio = new CartaBaralho(vazio);
        CartaBaralho cartaPeca = new CartaBaralho(peca);

        this.tabuleiroRestaUm = new TabuleiroRestaUm(7, 7, cartaJogavel);

        tabuleiroRestaUm.setFundo(0, 0, cartaVazio);
        tabuleiroRestaUm.setFundo(0, 1, cartaVazio);
        tabuleiroRestaUm.setFundo(1, 0, cartaVazio);
        tabuleiroRestaUm.setFundo(1, 1, cartaVazio);

        tabuleiroRestaUm.setFundo(0, 5, cartaVazio);
        tabuleiroRestaUm.setFundo(0, 6, cartaVazio);
        tabuleiroRestaUm.setFundo(1, 5, cartaVazio);
        tabuleiroRestaUm.setFundo(1, 6, cartaVazio);

        tabuleiroRestaUm.setFundo(5, 5, cartaVazio);
        tabuleiroRestaUm.setFundo(6, 6, cartaVazio);
        tabuleiroRestaUm.setFundo(6, 5, cartaVazio);
        tabuleiroRestaUm.setFundo(5, 6, cartaVazio);

        tabuleiroRestaUm.setFundo(5, 0, cartaVazio);
        tabuleiroRestaUm.setFundo(6, 0, cartaVazio);
        tabuleiroRestaUm.setFundo(5, 1, cartaVazio);
        tabuleiroRestaUm.setFundo(6, 1, cartaVazio);

        tabuleiroRestaUm.colocaCarta(4,3,cartaPeca);

        tabuleiroRestaUm.colocaCarta(3,0,cartaPeca);
        tabuleiroRestaUm.colocaCarta(3,1,cartaPeca);

//        tabuleiroRestaUm.colocaCarta(3,3,cartaPeca);
        tabuleiroRestaUm.colocaCarta(3,3,cartaPeca);
        tabuleiroRestaUm.colocaCarta(3,5,cartaPeca);


    }
/*
      public Jogo() {
        StringColorida jogavel = new StringColorida("   ", Cor.VERDE, Cor.FUNDO_BRANCO_BRANCO);
        StringColorida vazio = new StringColorida(" X ", Cor.BRANCO, Cor.FUNDO_PRETO);
        StringColorida peca = new StringColorida(" ⍟ ", Cor.VERMELHO, Cor.FUNDO_BRANCO_BRANCO);

        CartaBaralho cartaJogavel = new CartaBaralho(jogavel);
        CartaBaralho cartaVazio = new CartaBaralho(vazio);
        CartaBaralho cartaPeca = new CartaBaralho(peca);

        this.tabuleiroRestaUm = new TabuleiroRestaUm(7, 7, cartaJogavel);

        tabuleiroRestaUm.setFundo(0, 0, cartaVazio);
        tabuleiroRestaUm.setFundo(0, 1, cartaVazio);
        tabuleiroRestaUm.setFundo(1, 0, cartaVazio);
        tabuleiroRestaUm.setFundo(1, 1, cartaVazio);

        tabuleiroRestaUm.setFundo(0, 5, cartaVazio);
        tabuleiroRestaUm.setFundo(0, 6, cartaVazio);
        tabuleiroRestaUm.setFundo(1, 5, cartaVazio);
        tabuleiroRestaUm.setFundo(1, 6, cartaVazio);

        tabuleiroRestaUm.setFundo(5, 5, cartaVazio);
        tabuleiroRestaUm.setFundo(6, 6, cartaVazio);
        tabuleiroRestaUm.setFundo(6, 5, cartaVazio);
        tabuleiroRestaUm.setFundo(5, 6, cartaVazio);

        tabuleiroRestaUm.setFundo(5, 0, cartaVazio);
        tabuleiroRestaUm.setFundo(6, 0, cartaVazio);
        tabuleiroRestaUm.setFundo(5, 1, cartaVazio);
        tabuleiroRestaUm.setFundo(6, 1, cartaVazio);

        tabuleiroRestaUm.colocaCarta(0,2,cartaPeca);
        tabuleiroRestaUm.colocaCarta(0,3,cartaPeca);
        tabuleiroRestaUm.colocaCarta(0,4,cartaPeca);

        tabuleiroRestaUm.colocaCarta(1,2,cartaPeca);
        tabuleiroRestaUm.colocaCarta(1,3,cartaPeca);
        tabuleiroRestaUm.colocaCarta(1,4,cartaPeca);

        tabuleiroRestaUm.colocaCarta(2,0,cartaPeca);
        tabuleiroRestaUm.colocaCarta(2,1,cartaPeca);
        tabuleiroRestaUm.colocaCarta(2,2,cartaPeca);
        tabuleiroRestaUm.colocaCarta(2,3,cartaPeca);
        tabuleiroRestaUm.colocaCarta(2,4,cartaPeca);
        tabuleiroRestaUm.colocaCarta(2,5,cartaPeca);
        tabuleiroRestaUm.colocaCarta(2,6,cartaPeca);

        tabuleiroRestaUm.colocaCarta(3,0,cartaPeca);
        tabuleiroRestaUm.colocaCarta(3,1,cartaPeca);
        tabuleiroRestaUm.colocaCarta(3,2,cartaPeca);
//        tabuleiroRestaUm.colocaCarta(3,3,cartaPeca);
        tabuleiroRestaUm.colocaCarta(3,4,cartaPeca);
        tabuleiroRestaUm.colocaCarta(3,5,cartaPeca);
        tabuleiroRestaUm.colocaCarta(3,6,cartaPeca);

        tabuleiroRestaUm.colocaCarta(4,0,cartaPeca);
        tabuleiroRestaUm.colocaCarta(4,1,cartaPeca);
        tabuleiroRestaUm.colocaCarta(4,2,cartaPeca);
        tabuleiroRestaUm.colocaCarta(4,3,cartaPeca);
        tabuleiroRestaUm.colocaCarta(4,4,cartaPeca);
        tabuleiroRestaUm.colocaCarta(4,5,cartaPeca);
        tabuleiroRestaUm.colocaCarta(4,6,cartaPeca);

        tabuleiroRestaUm.colocaCarta(5,2,cartaPeca);
        tabuleiroRestaUm.colocaCarta(5,3,cartaPeca);
        tabuleiroRestaUm.colocaCarta(5,4,cartaPeca);

        tabuleiroRestaUm.colocaCarta(6,2,cartaPeca);
        tabuleiroRestaUm.colocaCarta(6,3,cartaPeca);
        tabuleiroRestaUm.colocaCarta(6,4,cartaPeca);
    }
*/ // bckp tabuleiro

    public void novoJogo() {
        tabuleiroRestaUm.novoJogo();
        Console.println(" ");
        Console.println(tabuleiroRestaUm);
    }

    public void mostrarTabuleiro() {
        if (tabuleiroRestaUm != null)
            Console.println(tabuleiroRestaUm);
        else
            Console.println("Nenhum jogo no momento.");
    }

    public TabuleiroRestaUm getTabuleiro() {
        return tabuleiroRestaUm;
    }

    // Função para verificar se restou um e retornar vitória
    public boolean vitoria() {
        int contador = 0;
        for (int i = 0; i < getTabuleiro().getTotalLinhas(); i++) {
            for (int j = 0; j < getTabuleiro().getTotalColunas(); j++) {
                if (getTabuleiro().getPilha(i, j).verTopo() != null &&
                        getTabuleiro().getPilha(i, j).verTopo().equals(getTabuleiro().cartaPeca)) {
                    contador++;
                }
            }
        }
        return contador == 1;
    }

/*
    Função movimentos restantes feita com base no gpt, pedi uma base para ele e organizei e formatei para que funcionasse adequadamente
 */

    // Função para verificar se há movimentos restantes possíveis no tabuleiro
    public boolean movimentosRestantes() {
        for (int i = 0; i < getTabuleiro().getTotalLinhas(); i++) {
            for (int j = 0; j < getTabuleiro().getTotalColunas(); j++) {
                if (getTabuleiro().getPilha(i, j).verTopo() != null &&
                        getTabuleiro().getPilha(i, j).verTopo().equals(getTabuleiro().cartaPeca)) {

                    // Verificar movimentos horizontais e verticais possíveis
                    if (podeMover(i, j, i, j + 2) ||
                            podeMover(i, j, i, j - 2) ||
                            podeMover(i, j, i + 2, j) ||
                            podeMover(i, j, i - 2, j)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean podeMover(int linhaInicial, int colunaInicial, int linhaFinal, int colunaFinal) {
        // Verifica se está dentro dos limites do tabuleiro
        if (linhaFinal < 0 || linhaFinal >= getTabuleiro().getTotalLinhas() ||
                colunaFinal < 0 || colunaFinal >= getTabuleiro().getTotalColunas()) {
            return false;
        }

        // Calcula a posição intermediária
        int linhaMeio = (linhaInicial + linhaFinal) / 2;
        int colunaMeio = (colunaInicial + colunaFinal) / 2;

        // Verifica se o movimento é válido (destino vazio e intermediário com peça)
        return getTabuleiro().getPilha(linhaFinal, colunaFinal).verTopo() == getTabuleiro().cartaVazio ||
                getTabuleiro().getPilha(linhaFinal,colunaFinal).verTopo() == null &&
                getTabuleiro().getPilha(linhaMeio, colunaMeio).verTopo() != null &&
                getTabuleiro().getPilha(linhaMeio, colunaMeio).verTopo().equals(getTabuleiro().cartaPeca);
    }
}

