import java.util.List;

public class Ipod implements ReprodutorMuisicial {
    private Musica musicaSelecionada = new Musica("With You");
    private List<Musica> musicas = List.of(musicaSelecionada,new Musica("Faint"));
   
    private boolean estaTocando=false;
    
    @Override
    public void tocar() {
       if(musicaSelecionada!=null && !estaTocando){
            System.out.println("Tocando agora: "+musicaSelecionada.getNome());
       }
    }

    @Override
    public void pausar() {
      if(estaTocando){
        estaTocando=false;
        System.out.println("Pausado");
      }
    }

    @Override
    public void selecionarMusica() {
       System.out.println("Exibindo lista");
       musicas.forEach(musica->System.out.println(musica.getNome()));
       

    }

}
