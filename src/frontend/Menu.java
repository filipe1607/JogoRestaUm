package src.frontend;

import console.Console;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("Menu Inicial");
            System.out.println("Escolha uma opção");
            System.out.println("1 - Iniciar");
            System.out.println("2 - Pausar");
            System.out.println("3 - Sair");
            Tela();
            System.out.print("Opção: ");
            escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Inicio de jogo");
                    break;
                case 2:
                    System.out.println("Pausar jogo");
                    break;
                case 3:
                    System.out.println("Sair do jogo");
                default:
                    Console.println("Opção Inválida");
                    break;
            }
        } while (true);
    }

    private static void Tela() {
    }
}