//package src.frontend;
//
//import console.Console;
//import cores.Cor;
//import cores.StringColorida;
//import mecanicas.Carta;
//import mecanicas.Tabuleiro;
//
//public class TestadorTabuleiro extends Tabuleiro {
//
//    // Construtor que inicializa o tabuleiro com o fundo especificado
//    public TestadorTabuleiro(int numLinhas, int numColunas, CartaBaralho fundo) {
//        super(numLinhas, numColunas, fundo);
//    }
//
//    CartaBaralho cartaJogavel = new CartaBaralho(new StringColorida("   ", Cor.VERDE, Cor.FUNDO_BRANCO_BRANCO));
//    CartaBaralho cartaVazio = new CartaBaralho(new StringColorida(" X ", Cor.BRANCO, Cor.FUNDO_PRETO));
//    CartaBaralho cartaPeca = new CartaBaralho(new StringColorida(" ⍟ ", Cor.VERMELHO, Cor.FUNDO_BRANCO_BRANCO));
//
//
//    /**
//     * Verifica se uma carta é jogável.
//     *
//     * @param carta Carta a ser verificada
//     * @return true se a carta for jogável, false caso contrário
//     */
//    private boolean isCartaJogavel(Carta carta) {
//        return carta != null && carta.toString().contains("VERDE");
//    }
//    /**
//     * Verifica se uma carta é uma peça.
//     *
//     * @param carta Carta a ser verificada
//     * @return true se a carta for uma peça, false caso contrário
//     */
//    private boolean isCartaPeca(Carta carta) {
//        return carta != null && carta.toString().contains("ROSA");
//    }
//
//    /**
//     * Verifica se um movimento é válido.
//     *
//     * @param linhaOrigem   Linha da posição de origem
//     * @param colunaOrigem  Coluna da posição de origem
//     * @param linhaDestino  Linha da posição de destino
//     * @param colunaDestino Coluna da posição de destino
//     * @return true se o movimento for válido, false caso contrário
//     */
//
///*
//    public boolean movimentoValido(int linhaOrigem, int colunaOrigem, int linhaDestino, int colunaDestino) {
//        // Verifica se a origem possui uma peça
//        if (!isCartaPeca(pegaCarta(linhaOrigem, colunaOrigem))) {
//            return false;
//        }
//
//        // Verifica se o destino está dentro dos limites do tabuleiro
//        if (linhaDestino < 0 || linhaDestino >= getTotalLinhas() || colunaDestino < 0 || colunaDestino >= getTotalColunas()) {
//            return false;
//        }
//
//        // Verifica se o destino está vazio (ou seja, é jogável)
//        if (!isCartaJogavel(getFundo(linhaDestino, colunaDestino))) {
//            return false;
//        }
//
//        // Verifica se o movimento é de 2 espaços em linha reta e se há uma peça para pular
//        if (Math.abs(linhaOrigem - linhaDestino) == 2 && colunaOrigem == colunaDestino) {
//            int linhaMeio = (linhaOrigem + linhaDestino) / 2;
//            return isCartaPeca(getPilha(linhaMeio, colunaOrigem).verTopo());
//        } else if (Math.abs(colunaOrigem - colunaDestino) == 2 && linhaOrigem == linhaDestino) {
//            int colunaMeio = (colunaOrigem + colunaDestino) / 2;
//            return isCartaPeca(getPilha(linhaOrigem, colunaMeio).verTopo());
//        }
//
//        return false;
//    }
//*/ // função do movimento
//
//
////    /**
////     * Move uma peça no tabuleiro.
////     *
////     * @param linhaOrigem    Linha da posição de origem
////     * @param colunaOrigem   Coluna da posição de origem
////     * @param linhaDestino   Linha da posição de destino
////     * @param colunaDestino  Coluna da posição de destino
////     **/
////    public  void movePeca(int linhaOrigem, int colunaOrigem, int linhaDestino, int colunaDestino) {
////        // Verifica se o movimento é válido
////      if (movimentoValido(linhaOrigem, colunaOrigem, linhaDestino, colunaDestino)) {
////
////
////
////            // Remove a peça da posição de origem
////            Carta cartaOrigem = pegaCarta(linhaOrigem, colunaOrigem);
////            setFundo(linhaOrigem, colunaOrigem, new CartaBaralho(new StringColorida("   ", Cor.VERDE, Cor.FUNDO_PRETO)));
////
////            // Remove a peça que foi pulada
////            if (linhaOrigem != linhaDestino) {
////                int colunaMeio = colunaDestino - 1;
////                pegaCarta(linhaOrigem, colunaMeio);
////            //    colocaCarta(linhaOrigem, colunaMeio, new CartaBaralho(new StringColorida("   ", Cor.VERDE, Cor.FUNDO_PRETO)));
////            } else {
////                int linhaMeio = linhaDestino - 1;
////                pegaCarta(linhaMeio, colunaOrigem);
////                colocaCarta(linhaMeio, colunaOrigem, cartaJogavel);
////
////            }
////
////            // Coloca a peça na posição de destino
////            colocaCarta(linhaDestino, colunaDestino, cartaPeca);
////
////      }
////    }
//
//    /**
//     * Move uma peça no tabuleiro.
//     *
//     * @param linhaOrigem    Linha da posição de origem
//     * @param colunaOrigem   Coluna da posição de origem
//     * @param linhaDestino   Linha da posição de destino
//     * @param colunaDestino  Coluna da posição de destino
//     */
//    public void movePeca(int linhaOrigem, int colunaOrigem, int linhaDestino, int colunaDestino) {
//        // Verifica se a origem possui uma peça
//        if (!isCartaPeca(pegaCarta(linhaOrigem, colunaOrigem))) {
//            System.out.println("Movimento inválido: a origem não possui uma peça.");
//            return;
//        }
//
//        // Verifica se o destino está dentro dos limites do tabuleiro
//        if (linhaDestino < 0 || linhaDestino >= getTotalLinhas() || colunaDestino < 0 || colunaDestino >= getTotalColunas()) {
//            System.out.println("Movimento inválido: destino fora dos limites do tabuleiro.");
//            return;
//        }
//
//        // Verifica se o destino está vazio (ou seja, é jogável)
//        if (!isCartaJogavel(getFundo(linhaDestino, colunaDestino))) {
//            System.out.println("Movimento inválido: o destino não está vazio.");
//            return;
//        }
//
//        // Verifica se o movimento é de 2 espaços em linha reta e se há uma peça para pular
//        if (Math.abs(linhaOrigem - linhaDestino) == 2 && colunaOrigem == colunaDestino) {
//            int linhaMeio = (linhaOrigem + linhaDestino) / 2;
//            if (!isCartaPeca(pegaCarta(linhaMeio, colunaOrigem))) {
//                System.out.println("Movimento inválido: não há peça para pular.");
//                return;
//            }
//        } else if (Math.abs(colunaOrigem - colunaDestino) == 2 && linhaOrigem == linhaDestino) {
//            int colunaMeio = (colunaOrigem + colunaDestino) / 2;
//            if (!isCartaPeca(pegaCarta(linhaOrigem, colunaMeio))) {
//                System.out.println("Movimento inválido: não há peça para pular.");
//                return;
//            }
//        } else {
//            System.out.println("Movimento inválido: movimento não é de 2 espaços em linha reta.");
//            return;
//        }
//
//        // Pega a peça da posição de origem
//        Carta cartaOrigem = pegaCarta(linhaOrigem, colunaOrigem);
//
//        // Remove a peça da posição de origem
//        setFundo(linhaOrigem, colunaOrigem, new CartaBaralho(new StringColorida("   ", Cor.VERDE, Cor.FUNDO_PRETO)));
//
//        // Remove a peça que foi pulada
//        if (linhaOrigem == linhaDestino) {
//            int colunaMeio = (colunaOrigem + colunaDestino) / 2;
//            setFundo(linhaOrigem, colunaMeio, new CartaBaralho(new StringColorida("   ", Cor.VERDE, Cor.FUNDO_PRETO)));
//        } else {
//            int linhaMeio = (linhaOrigem + linhaDestino) / 2;
//            setFundo(linhaMeio, colunaOrigem, new CartaBaralho(new StringColorida("   ", Cor.VERDE, Cor.FUNDO_PRETO)));
//        }
//
//        // Coloca a peça na posição de destino
//        colocaCarta(linhaDestino, colunaDestino, cartaOrigem);
//    }
//
//
//
//    public static void main(String[] args) {
//        // Exemplo de utilização das funções
//
//        // Criação de cartas para o tabuleiro
//        CartaBaralho cartaJogavel = new CartaBaralho(new StringColorida("   ", Cor.VERDE, Cor.FUNDO_BRANCO_BRANCO));
//        CartaBaralho cartaVazio = new CartaBaralho(new StringColorida(" X ", Cor.BRANCO, Cor.FUNDO_PRETO));
//        CartaBaralho cartaPeca = new CartaBaralho(new StringColorida(" ⍟ ", Cor.VERMELHO, Cor.FUNDO_BRANCO_BRANCO));
//
//        // Inicializa o tabuleiro Resta Um
//        TestadorTabuleiro tabuleiro = new TestadorTabuleiro(7, 7, cartaJogavel);
//
//        /*
//         * Imprime o tabuleiro com coordenadas.
//
//        public void printTabuleiro() {
//            // Imprime o cabeçalho das colunas
//            System.out.print("   ");
//            for (int col = 0; col < getTotalColunas(); col++) {
//                System.out.print(" " + col + "  ");
//            }
//            System.out.println();
//
//            // Imprime cada linha do tabuleiro com os números das linhas
//            for (int linha = 0; linha < getTotalLinhas(); linha++) {
//                System.out.print(" " + linha + " "); // Número da linha
//                for (int coluna = 0; coluna < getTotalColunas(); coluna++) {
//                    Carta carta = getPilha(linha, coluna).pegaCarta();
//                    if (carta != null) {
//                        System.out.print(carta + " ");
//                    } else {
//                        System.out.print(Tabuleiro.setFundo(linha, coluna) + " ");
//                    }
//                }
//                System.out.println();
//            }
//        }
//         */ // Tabuleiro coordenadas a resolver.
//
//
//        // Exemplo de configuração inicial do tabuleiro
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
//            tabuleiro.setFundo(posicao[0], posicao[1], cartaVazio);
//        }
//
//        // Coloca peças nas áreas jogáveis
//        for (int[] posicao : jogaveis) {
//            if (!(posicao[0] == 3 && posicao[1] == 3)) { // Ignora a posição central
//                tabuleiro.colocaCarta(posicao[0], posicao[1], cartaPeca);
//            }
//        }
//        // Coloca área jogável no centro do jogo
//        tabuleiro.setFundo(3,3,cartaJogavel);
//
//
//        // Exemplo de movimentos
//        Console.println("Tabuleiro inicial: ");
//        Console.println(tabuleiro);
//
////        tabuleiro.movePeca(2, 3, 4, 2, cartaPeca, cartaJogavel); // Movimento válido
////        Console.println("Após mover peça de (2,3) para (4,3):");
////        tabuleiro.movimentoValido(1,3,3,3);
////        Console.println(tabuleiro.movimentoValido(1,3,3,3));
////        tabuleiro.movimentoValido(1,3,3,3);
//
//        // Move peça de (1, 3) para (3, 3)
//        tabuleiro.movePeca(3, 1, 3, 5);
//        System.out.println("Após mover peça de (1,3) para (3,3):");
//        Console.println(tabuleiro);
//
//    }
//}
