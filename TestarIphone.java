public class TestarIphone {

    public static void main(String[] args) {
        System.out.println("Testando Iphone...\n");
        Iphone iPhone = new Iphone(new Contacts(),new Ipod(),new Safari());

        testarContatcs(iPhone);
        testarIpod(iPhone);
        testarSafari(iPhone);
    }

    private static void testarContatcs(Iphone iPhone) {

        iPhone.ligar();
        iPhone.atender();
        iPhone.iniciarCorreioVoz();
    }

    private static void testarIpod(Iphone iPhone) {

        iPhone.tocar();
        iPhone.pausar();
        iPhone.selecionarMusica();
    }

    private static void testarSafari(Iphone iPhone) {

        iPhone.exibirPagina();
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();
    }
}
