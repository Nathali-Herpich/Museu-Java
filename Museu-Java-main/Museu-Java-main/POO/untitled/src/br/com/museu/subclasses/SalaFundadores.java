package br.com.museu.subclasses;

public class SalaFundadores {
    String fundador1;
    String empresa;

    public String getFundador1() {
        return fundador1 = "James Gosling";
    }

    public void setFundador1(String fundador1) {
        this.fundador1 = fundador1;
    }

    public String getEmpresa2() {
        return empresa = " Sun Microsystems";
    }

    public void setEmpresa(String fundador2) {
        this.empresa = empresa;
    }

   public void exibirSobreOsFundadores(){
        System.out.println("""
                Ótima escolha! 
                Aqui temos a história de James Gosling e onde fundou a linguagem.
                A linguagem Java foi idealizada por James. Lançada em 1995 como componente 
                central da plataforma Java da Sun(sua empresa). Os compiladores Java de
                implementação original e de referência, máquinas virtuais e bibliotecas 
                foram lançados pela Sun sob licenças proprietárias.
                """);
    }
}
