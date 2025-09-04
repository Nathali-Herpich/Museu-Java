package br.com.museu;

import br.com.museu.subclasses.SalaFundadores;
import br.com.museu.subclasses.SalaVersoes;
import br.com.museu.subclasses.SalaCuriosidades;

import java.util.Scanner;

public class Visitante {
    public static void main(String[] args) {
        sala sala = new sala(); // Certifique-se de que a classe Sala existe!
        sala.exibirDescrição();

        Scanner scanner = new Scanner(System.in);
        int escolha;

        System.out.println("""
                Eu serei a sua guia! Pode me chamar pelo meu nome, Nathali.
                Está pronto para encher sua cabeça de novos conhecimentos?
                Primeiro preciso que diga-me seu nome:
                """);
        String nome = scanner.nextLine();

        System.out.print("Agora para procedimentos padrões, diga-me sua idade: ");
        int idade = Integer.parseInt(scanner.nextLine());

        System.out.println("""
                Agora, precisa escolher um caminho para seguir.
                Temos 3 salas preparadas para receber você. Preparado(a)?
                """);

        do {
            System.out.println("""
                    Digite sua escolha:
                    1 - Sala dos Fundadores
                    2 - Sala das Versões
                    3 - Sala de Curiosidades
                    0 - Sair do Museu
                    """);

            escolha = Integer.parseInt(scanner.nextLine());

            SalaFundadores salaFundadores = new SalaFundadores();
            SalaVersoes salaVersoes = new SalaVersoes();
            SalaCuriosidades salaCuriosidades = new SalaCuriosidades();

            switch (escolha) {
                case 1:
                    salaFundadores.exibirSobreOsFundadores();
                    break;
                case 2:
                    salaVersoes.exibirVersoes();
                    break;
                case 3:
                    salaCuriosidades.exibirCuriosidades();
                    break;
                case 0:
                    System.out.println("Ahhhh, que pena! Já tens que ir?");
                    System.out.println("Tudo bem! Obrigado por ter vindo! Até uma próxima :)");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma sala existente.");
            }
        } while (escolha != 0);

        scanner.close();
    }
}
