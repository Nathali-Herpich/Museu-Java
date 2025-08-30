package br.com.museu;

public class sala {
    String name;
    String descricao;
    int anoDeCriacao;

    public String getName() {
        return name = "Instituto Histórico do Código";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescricao() {
        return descricao = descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public void setAnoDeCriacao(int anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }

    public void exibirDescrição(){
        System.out.println("""
                 Seja bem-vindo ao Instituto Histórico do Código!
                 O Instituto Histórico do Código é um espaço dedicado à preservação,
                 celebração e disseminação da história da programação e da computação.
                 Nosso objetivo é mostrar como as linguagens, algoritmos,
                 sistemas e pessoas moldaram o mundo digital em que vivemos hoje.
                 Por meio de exposições interativas, acervos digitais,
                  linha do tempo de linguagens,
                 homenagens a pioneiros e demonstrações de códigos históricos, 
                 o Instituto convida o público — de curiosos a profissionais da área —
                 a mergulhar nas raízes da lógica computacional e da evolução tecnológica.
                 Aqui, cada linha de código conta uma história.
                 Cada bug se torna aprendizado. E cada linguagem é uma ponte entre passado e futuro.
                 Seja bem-vindo ao lugar onde a programação ganha memória e significado.
                                
                """);
    }
}
