import java.util.LinkedList;
import java.util.List;

public class Safari implements NavegadorNaInternet {
    private Aba abaAtual= new Aba("https://web.dio.me/home");
    private List<Aba> abas = new LinkedList<>();

    {
        abas.add(abaAtual);
    }
    
    @Override
    public void exibirPagina() {
       System.out.println("Exibindo pagina: "+abaAtual.getPagina());
    }

    @Override
    public void adicionarNovaAba() {
       abas.add(new Aba("https://google.com"));
       System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina atualizada");
    }

}
