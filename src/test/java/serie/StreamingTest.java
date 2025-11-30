package serie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class StreamingTest {

    @Test
    void deveRetornarCatalogoStreaming() {
        Serie serie1 = new Serie("Stranger Things");

        Serie serie2 = new Serie("The Office");
        Episodio episodio1 = new Episodio("Piloto", 20);
        serie2.addConteudo(episodio1);

        Serie serie3 = new Serie("How I Met Your Mother");
        Episodio episodio2 = new Episodio("Ted conhece Robin", 20);
        Episodio episodio3 = new Episodio("Ted vai ao aeroporto com Barney", 20);
        serie3.addConteudo(episodio2);
        serie3.addConteudo(episodio3);

        Serie catalogo = new Serie("Séries Mais Vistas");
        catalogo.addConteudo(serie1);
        catalogo.addConteudo(serie2);
        catalogo.addConteudo(serie3);

        Streaming streaming = new Streaming();
        streaming.setCatalogo(catalogo);

        assertEquals("Série: Séries Mais Vistas\n" +
                "Série: Stranger Things\n" +
                "Série: The Office\n" +
                "Episódio: Piloto - tempo: 20\n" +
                "Série: How I Met Your Mother\n" +
                "Episódio: Ted conhece Robin - tempo: 20\n" +
                "Episódio: Ted vai ao aeroporto com Barney - tempo: 20\n", streaming.getCatalogo());
    }
    @Test
    void deveRetornarExecacaoStreamingSemCatalogo() {
        try {
            Streaming streaming = new Streaming();
            streaming.getCatalogo();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Serviço de streaming sem catálogo", e.getMessage());
        }
    }

}
