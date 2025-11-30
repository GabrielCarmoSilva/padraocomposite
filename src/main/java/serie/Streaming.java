package serie;

public class Streaming {

    private Conteudo catalogo;

    public void setCatalogo(Conteudo catalogo) {
        this.catalogo = catalogo;
    }

    public String getCatalogo() {
        if (this.catalogo == null) {
            throw new NullPointerException("Serviço de streaming sem catálogo");
        }
        return this.catalogo.getConteudo();
    }
}
