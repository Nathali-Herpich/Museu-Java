package br.com.museu;

import br.com.museu.subclasses.SalaFundadores;
import br.com.museu.subclasses.SalaVersoes;
import br.com.museu.subclasses.SalaCuriosidades;

import java.util.Scanner;

public class Visitante {
    public static void main(String[] args) {
        sala Sala = new sala();
        Sala.exibirDescrição();
        Scanner scanner = new Scanner(System.in);

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
            
            Digite sua escolha:
            1 - Sala dos Fundadores
            2 - Sala das Versões
            3 - Sala de Curiosidades
        """);

        //Leia uma linha do teclado como texto e
        // converta esse texto em um número inteiro para armazenar na variável
        int escolha = Integer.parseInt(scanner.nextLine());


        SalaFundadores salaFundadores = new SalaFundadores();
        SalaVersoes salaVersoes = new SalaVersoes();
        SalaCuriosidades salaCuriosidades = new SalaCuriosidades();


        switch (escolha) {
            case 1 -> salaFundadores.exibirSobreOsFundadores();
            case 2 -> salaVersoes.exibirVersoes();
            case 3 -> salaCuriosidades.exibirCuriosidades();
            default -> {
                System.out.println("Ahhhh, que pena! Já tens que ir?");
                System.out.println("Tudo bem! Obrigado por ter vindo! Até uma próxima :)");
            }
        }

        scanner.close();
    }
}
