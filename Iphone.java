public class Iphone implements AparelhoTelefonico, ReprodutorMuisicial, NavegadorNaInternet{
    private AparelhoTelefonico aparelhoTelefonico;
    private ReprodutorMuisicial reprodutorMuisicial;
    private NavegadorNaInternet navegadorNaInternet;
    
    public Iphone(AparelhoTelefonico aparelhoTelefonico , ReprodutorMuisicial reprodutorMuisicial,  NavegadorNaInternet navegadorNaInternet) {
        this.aparelhoTelefonico=aparelhoTelefonico;
        this.reprodutorMuisicial = reprodutorMuisicial;
        this.navegadorNaInternet = navegadorNaInternet;
    }
    @Override
    public void ligar() {
       aparelhoTelefonico.ligar();
    }
    @Override
    public void atender() {
        aparelhoTelefonico.atender();
    }
    @Override
    public void iniciarCorreioVoz() {
        aparelhoTelefonico.iniciarCorreioVoz();
    }
    @Override
    public void tocar() {
       reprodutorMuisicial.tocar();
    }
    @Override
    public void pausar() {
        reprodutorMuisicial.pausar();
    }
    @Override
    public void selecionarMusica() {
        reprodutorMuisicial.selecionarMusica();
    }
    @Override
    public void exibirPagina() {
        navegadorNaInternet.exibirPagina();
    }
    @Override
    public void adicionarNovaAba() {
        navegadorNaInternet.adicionarNovaAba();
    }
    @Override
    public void atualizarPagina() {
       navegadorNaInternet.atualizarPagina();
    }

}