package br.com.museu.subclasses;

public class SalaCuriosidades {
    String curiosidades;

    public String getCuriosidades() {
        return curiosidades;
    }

    public void setCuriosidades(String curiosidades) {
        this.curiosidades = curiosidades;
    }

    public void exibirCuriosidades(){
        System.out.println("""
                
                    Nome e Símbolo:
                    O nome "Java" foi uma escolha dos seus criadores, que eram grandes consumidores de café, sendo uma referência ao café da ilha de Java, na Indonésia.
                    O símbolo da linguagem é uma xícara de café, reforçando essa ligação.
                    Origem e Slogan:
                    Originalmente, Java não foi criada para a web, 
                    mas sim para o desenvolvimento de software para dispositivos eletrônicos embarcados, 
                    como televisores interativos e controles remotos.
                    Seu famoso slogan "Escreva uma vez, execute em qualquer lugar" 
                    (WORA) destaca sua portabilidade: 
                    o código Java pode ser executado em qualquer sistema operacional 
                    ou dispositivo que possua uma Java Virtual Machine (JVM).
                """);
    }
}
