package br.com.museu.subclasses;

public class SalaVersoes{
    double versoes;

    public double getVersoes() {
        return versoes;
    }

    public void setVersoes(double versoes) {
        this.versoes = versoes;
    }

    public void exibirVersoes(){
        System.out.println("""
                    Agora estamos nos encaminhando para as versões em java.
                    As principais versões do Java são as versões LTS (Long-Term Support),
                    com suporte estendido para estabilidade e segurança em projetos de produção. 
                    Atualmente, as versões mais recomendadas para desenvolvimento são o Java 17 e o Java 21, 
                    pois oferecem estabilidade a longo prazo, sendo o Java 11 uma opção mais antiga, 
                porém ainda suportada. 
                Versões não-LTS, como a 18, 19 ou 20, são recomendadas para exploração de novas funcionalidades em projetos de menor risco.
                """);
    }

}
