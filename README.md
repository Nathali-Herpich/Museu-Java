# 🏛️ Museu da Programação

Bem-vindo ao **Museu da Programação**, um projeto em Java que simula uma visita interativa a um museu digital. Por meio de um menu guiado, o visitante pode conhecer diferentes salas temáticas relacionadas ao mundo da tecnologia e da programação.

---

## 👩🏻‍💻 Guia Virtual

Você será recebido(a) por **Nathali**, sua guia virtual, que fará perguntas e direcionará sua visita a uma das três salas disponíveis:

- 👥 **Sala dos Fundadores**  
- 📜 **Sala das Versões**  
- 💡 **Sala de Curiosidades**

---

## 🧠 Sobre a Classe `Visitante`

A classe `Visitante` é o ponto de entrada principal dessa versão. Ela conduz a interação com o usuário:

```java
public class Visitante {
    public static void main(String[] args) {
        // Pergunta nome, idade e apresenta opções
        // Instancia as salas e chama o método correspondente
    }
}
````
## 🗂️ Estrutura do Projeto
````
📦 br.com.museu
 └── Visitante.java

📦 br.com.museu.subclasses
 ├── SalaFundadores.java
 ├── SalaVersoes.java
 └── SalaCuriosidades.java
````
Cada sala possui um método que exibe suas informações específicas:
````Java
exibirSobreOsFundadores()

exibirVersoes()

exibirCuriosidades()

````

## 💻 Tecnologias

- Java

- Paradigma Orientado a Objetos

- Entrada de dados com Scanner

- Estruturas de controle (switch, if, etc.)
