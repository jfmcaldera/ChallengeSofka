package GameConfig;

public class Premio {

    boolean puntos;
    private int valor;
    private int ronda;

    public Premio() {
    }

    public Premio(boolean puntos, int valor, int ronda) {
        this.puntos = puntos;
        this.valor = valor;
    }

    public boolean isPuntos() {
        return puntos;
    }

    public void setPuntos(boolean puntos) {
        this.puntos = puntos;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getRonda() {
        return ronda;
    }

    public void setRonda(int ronda) {
        this.ronda = ronda;
    }


}
