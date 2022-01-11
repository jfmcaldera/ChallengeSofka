package GameConfig;

import java.util.List;

public class Categoria {
    private String nombre;
    private int nivel;

    public void setPreguntas(List<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    private List<Pregunta> preguntas;

    public List<Pregunta> getPreguntas() {
        return preguntas;
    }

    public Categoria() {
    }

    public Categoria(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString(){
        return ("Nombre: " +getNombre()+ " Nivel: " +getNivel());
    }
}
