import java.util.ArrayList;
import java.util.List;

// Classe modelo (Orientação a Objetos)
class Evento {
    private String nome;
    private String data;
    private String local;
    private String hora;

    public Evento(String nome, String data, String local, String hora) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Evento: " + nome + " | Data: " + data + " | Local: " + local + " | Hora: " + hora;
    }
}

// Classe de Gerenciamento
public class SistemaCadastro {
    private List<Evento> eventos = new ArrayList<>();

    public void adicionarEvento(String nome, String data, String local, String hora) {
        eventos.add(new Evento(nome, data, local, hora));
        System.out.println("Evento '" + nome + "' adicionado com sucesso!");
    }

    public void listarEventos() {
        System.out.println("\n--- Lista de Eventos ---");
        for (Evento e : eventos) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        SistemaCadastro sistema = new SistemaCadastro();
        
        // Exemplo de uso
        sistema.adicionarEvento("Jogar Crisom Desert", "19/03/2026", "Discord", "19:00");
        sistema.adicionarEvento("Unidos pelo Samba", " 15/03/2026", "Centro de Convencoes", "15:00");
        
        sistema.listarEventos();
    }
}