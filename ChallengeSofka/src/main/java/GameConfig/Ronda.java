package GameConfig;

import java.util.List;
import java.util.Random;

public class Ronda {
    Pregunta pregunta;
    Premio premio;
    Concursante concursante;
    String opcRespuesta;
    public Ronda(Concursante concursante,Categoria categorias,Premio premio){
        Random ran = new Random();
        this.setPregunta(categorias.getPreguntas().get(3));
        this.setPremio(premio);
        this.setConcursante(concursante);
    }



    public Pregunta getPregunta() {
        return pregunta;
    }

    public void setPregunta(Pregunta pregunta) {
        this.pregunta = pregunta;
    }

    public Premio getPremio() {
        return premio;
    }

    public void setPremio(Premio premio) {
        this.premio = premio;
    }

    public Concursante getConcursante() {
        return concursante;
    }

    public String getOpcRespuesta() {
        return opcRespuesta;
    }

    public void setOpcRespuesta(String opcRespuesta) {
        this.opcRespuesta = opcRespuesta;
    }

    public void setConcursante(Concursante concursante) {
        this.concursante = concursante;
    }
}
