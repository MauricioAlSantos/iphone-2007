import java.util.LinkedList;
import java.util.List;

public class Contacts implements AparelhoTelefonico{
    Contato contatoSelecionado = new Contato("Jão","8323322112");
    List<Contato> contatos = new LinkedList<>();
    List<CorreioVoz> correiosVoz = new LinkedList<>();;
    


    public void ligar(){
        System.out.println("Ligando para: "+contatoSelecionado.getNome());
    }

    public void  atender(){
        System.out.println("Atendendo para: "+contatoSelecionado.getNome());
    }

    public void iniciarCorreioVoz(){
        System.out.println("Você tem "+correiosVoz.size()+" mensagens de voz");
    }
}