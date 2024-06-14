//package src.frontend;
//
//import console.Console;
//import cores.Cor;
//import cores.StringColorida;
//
//public class TabuleiroLipe{
//
//    public boolean movimentoValido(int linhaOrigem, int colunaOrigem, int linhaDestino, int colunaDestino) {
//        // Verifica se o destino está dentro do tabuleiro
//        if (linhaDestino < 0 || linhaDestino >= getTotalLinhas() || colunaDestino < 0 || colunaDestino >= getTotalColunas()) {
//            return false;
//        }
//        // Verifica se o destino está vazio
//        if (pegaCarta(linhaDestino, colunaDestino) != null) {
//            return false;
//        }
//        // Verifica se o movimento é de 2 espaços em linha reta e se há uma peça para pular
//        if (Math.abs(linhaOrigem - linhaDestino) == 2 && colunaOrigem == colunaDestino) {
//            int linhaMeio = (linhaOrigem + linhaDestino) / 2;
//            return pegaCarta(linhaMeio, colunaOrigem) != null;
//        } else if (Math.abs(colunaOrigem - colunaDestino) == 2 && linhaOrigem == linhaDestino) {
//            int colunaMeio = (colunaOrigem + colunaDestino) / 2;
//            return pegaCarta(linhaOrigem, colunaMeio) != null;
//        }
//        return false;
//    }
//
//    public void movePeca(int linhaOrigem, int colunaOrigem, int linhaDestino, int colunaDestino, CartaBaralho cartaPeca, CartaBaralho cartaJogavel) {
//        if (movimentoValido(linhaOrigem, colunaOrigem, linhaDestino, colunaDestino)) {
//            // Pega a peça da origem
//            pegaCarta(linhaOrigem, colunaOrigem);
//            // Coloca a peça no destino
//            colocaCarta(linhaDestino, colunaDestino, cartaPeca);
//            // Remove a peça que foi pulada
//            if (linhaOrigem == linhaDestino) {
//                int colunaMeio = (colunaOrigem + colunaDestino) / 2;
//                pegaCarta(linhaOrigem, colunaMeio); // Remove a peça pulada
//                setFundo(linhaOrigem, colunaMeio, cartaJogavel);
//            } else {
//                int linhaMeio = (linhaOrigem + linhaDestino) / 2;
//                pegaCarta(linhaMeio, colunaOrigem); // Remove a peça pulada
//                setFundo(linhaMeio, colunaOrigem, cartaJogavel);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        StringColorida jogavel = new StringColorida("   ", Cor.VERDE, Cor.FUNDO_PRETO);
//        StringColorida vazio = new StringColorida("   ", Cor.PRETO, Cor.FUNDO_PRETO);
//        StringColorida peca = new StringColorida(" ⍟ ", Cor.ROSA, Cor.FUNDO_PRETO);
//        CartaBaralho cartaJogavel = new CartaBaralho(jogavel);
//        CartaBaralho cartaVazio = new CartaBaralho(vazio);
//        CartaBaralho cartaPeca = new CartaBaralho(peca);
//        TabuleiroRestaUm restaUm = new TabuleiroRestaUm(7, 7, cartaJogavel);
//
//        // Define áreas não jogáveis
//        int[][] naoJogaveis = {
//                {0, 0}, {0, 1}, {1, 0}, {1, 1},
//                {0, 5}, {0, 6}, {1, 5}, {1, 6},
//                {5, 0}, {5, 1}, {6, 0}, {6, 1},
//                {5, 5}, {5, 6}, {6, 5}, {6, 6},
//                {3, 3}
//        };
//
//        // Define áreas jogáveis
//        int[][] jogaveis = {
//                {0, 2}, {0, 3}, {0, 4},
//                {1, 2}, {1, 3}, {1, 4},
//                {2, 0}, {2, 1}, {2, 2}, {2, 3}, {2, 4}, {2, 5}, {2, 6},
//                {3, 0}, {3, 1}, {3, 2}, /* {3, 3}, */ {3, 4}, {3, 5}, {3, 6},
//                {4, 0}, {4, 1}, {4, 2}, {4, 3}, {4, 4}, {4, 5}, {4, 6},
//                {5, 2}, {5, 3}, {5, 4},
//                {6, 2}, {6, 3}, {6, 4}
//        };
//
//        // Coloca cartas vazias nas áreas não jogáveis
//        for (int[] posicao : naoJogaveis) {
//            restaUm.setFundo(posicao[0], posicao[1], cartaVazio);
//        }
//
//        // Coloca peças nas áreas jogáveis
//        for (int[] posicao : jogaveis) {
//            if (!(posicao[0] == 3 && posicao[1] == 3)) { // Ignora a posição central
//                restaUm.colocaCarta(posicao[0], posicao[1], cartaPeca);
//            }
//        }
//
//        // Exibe o tabuleiro inicial
//        Console.println(restaUm);
//
//        // Teste de movimento
//        restaUm.movePeca(2, 3, 4, 3, cartaPeca, cartaJogavel); // Move peça de (2,3) para (4,3)
//        Console.println(restaUm);
//    }
//}
