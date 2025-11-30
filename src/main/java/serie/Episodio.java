package serie;

public class Episodio extends Conteudo {

    private int tempo;

    public Episodio(String descricao, int tempo) {
        super(descricao);
        this.tempo = tempo;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public String getConteudo() {
        return "Episódio: " + this.getDescricao() + " - tempo: " + this.tempo + "\n";
    }
}
