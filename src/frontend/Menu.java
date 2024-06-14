package src.frontend;
import console.Console;
import src.backend.Jogo;
import src.backend.TabuleiroRestaUm;

import java.util.Scanner;

public class Menu {
    private static Jogo jogoAtual;

    public static void main(String[] args) {
        inicio();
    }

    public static void inicio() {
        Scanner sc = new Scanner(System.in);
        int escolha;
        do {
            Tela();
            System.out.print("Opção: ");
            escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    Console.println("Novo jogo");
                    jogoAtual = new Jogo();
                    jogoAtual.novoJogo();
                    movimento();
                    break;
                case 2:
                    Console.println("Saindo do jogo");
                    TabuleiroRestaUm.sairDoPrograma();
                    break;
                default:
                    Console.println("Opção inválida");
                    break;
            }
        } while (true);
    }

    private static void Tela() {
        System.out.println("Menu Inicial");
        System.out.println("Escolha uma opção");
        System.out.println("1 - Iniciar novo jogo");
        System.out.println("2 - Sair");

    }

    public static void pause() {
        Scanner sc = new Scanner(System.in);
        int escolha;

        do {
            pausePrintsMenu();
            escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    Console.println("Retomar o jogo");
                    if (jogoAtual != null) {
                        jogoAtual.mostrarTabuleiro();
                        movimento();
                    } else
                        Console.println("Nenhum jogo em andamento");
                    break;
                case 2:
                    Console.println("Voltar ao menu");
                    inicio();
                    break;
                case 3:
                    Console.println("Sair do jogo");
                    TabuleiroRestaUm.sairDoPrograma();
                    break;
                default:
                    Console.println("Opção inválida");
                    break;

            }
        } while (true);
    }


    public static void pausePrintsMenu() {
        Console.println("Menu de pause");
        Console.println("1 - Retomar o jogo");
        Console.println("2 - Voltar ao menu");
        Console.println("3 - Sair");
        Console.print("Escolha: ");

    }

/*
    public static void pausePrints2() {
        Scanner scanner = new Scanner(System.in);
        int escolha;
        do {
            Tela();
            escolha = scanner.nextInt();

            switch (escolha) {

                case 1:
                    Console.println("Novo Jogo");

                    jogoAtual = new Jogo();
                    jogoAtual.novoJogo();
                    movimento();
                    break;

                case 2:
                    Console.println("Sair");
                    return;

                case 3:
                    Console.println("menu");
                    pausePrintsMenu();
                    break;
                default:
                    Console.println("Escolha");
                    break;


            }
        } while (true);
    }
*/

    public static void movimento() {
        Scanner sc = new Scanner(System.in);
        char escolha;
        do {
            Console.println("Digite 1 para fazer a jogada, P para pausar ou Q para sair: ");
            escolha = sc.next().toUpperCase().charAt(0);

            if (jogoAtual != null) {
                switch (escolha) {
                    case '1':
                        Console.print("Jogando...");
                        Console.println("");
                        Console.print("Escolha uma linha: ");
                        int linhaInicial = sc.nextInt();
                        //Console.println("");
                        Console.print("Escolha uma coluna: ");
                        int colunaInicial = sc.nextInt();
                        //Console.println("");
                        Console.print("Escolha a linha final: ");
                        int linhaFinal = sc.nextInt();
                        //Console.println("");
                        Console.print("Escolha a coluna final: ");
                        int colunaFinal = sc.nextInt();
                        Console.println("");

                        jogoAtual.getTabuleiro().moverPeca(linhaInicial, colunaInicial, linhaFinal, colunaFinal);
                        jogoAtual.mostrarTabuleiro();

                        if (jogoAtual.vitoria()) {
                            Console.println("Você venceu, fim de jogo!");
                            TabuleiroRestaUm.sairDoPrograma();
                        }
                        if (!jogoAtual.movimentosRestantes()) {
                            Console.println("Fim de jogo! Não há mais movimentos possíveis.");
                            TabuleiroRestaUm.sairDoPrograma();
                        }

                        break;
                    case 'P':
                        pause();
                        break;
                    case 'Q':
                        Console.println("Saindo do jogo");
                        TabuleiroRestaUm.sairDoPrograma();
                        break;
                    default:
                        Console.println("Opção inválida");
                        movimento();
                        break;
                }
            }
        } while (escolha != 'Q');
    }
}