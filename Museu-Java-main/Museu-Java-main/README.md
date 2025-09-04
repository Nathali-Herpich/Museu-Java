# 🏛️ Museu Virtual - Sistema de Visitação Interativa

Este projeto é uma simulação de um museu virtual em Java, onde o visitante é guiado por uma personagem chamada Nathali. A aplicação oferece uma experiência interativa com diferentes salas temáticas.

### 🚀 Execução

A classe principal do programa é a Visitante. Ela representa a entrada no museu e contém o fluxo interativo com o usuário.

Classe Principal:
````Java
public class Visitante {
    public static void main(String[] args) {
        // Código principal aqui
    }
}
````

### 🧭 Fluxo da Aplicação

- Ao iniciar a aplicação:

- O visitante é recebido por Nathali, a guia virtual.

- O programa solicita o nome e a idade do visitante.

O visitante pode escolher entre 3 salas disponíveis:

1. Sala dos Fundadores

2. Sala das Versões

3. Sala de Curiosidades

4. O visitante pode sair do museu digitando 0.

### 🏛️ Salas Disponíveis

As salas são implementadas em pacotes separados (br.com.museu.subclasses) e cada uma possui métodos específicos:

1. 🧑‍🔧 Sala dos Fundadores

Classe: 
````
SalaFundadores
````

Método: 
````
exibirSobreOsFundadores()
````
Exibe informações sobre os criadores do projeto ou da instituição representada.

### 2. 🧩 Sala das Versões

Classe: 
````
SalaVersoes
````
Método: 
````
exibirVersoes()
````
Apresenta a evolução das versões do projeto ou da tecnologia abordada.

### 3. 🧠 Sala de Curiosidades

Classe: 
````
SalaCuriosidades
````
Método: 
````
exibirCuriosidades()
````
Compartilha fatos interessantes e curiosidades sobre o tema do museu.

### 🎛️ Menu de Opções
Digite sua escolha:

1 - Sala dos Fundadores

2 - Sala das Versões

3 - Sala de Curiosidades

0 - Sair do Museu

### 🔄 Loop Interativo

O menu é exibido em um loop do-while, que permite ao visitante navegar pelas salas quantas vezes desejar, até decidir sair do museu.

### 🧹 Encerramento

Ao escolher sair (0), a aplicação exibe uma mensagem de despedida e finaliza a execução com scanner.close().
