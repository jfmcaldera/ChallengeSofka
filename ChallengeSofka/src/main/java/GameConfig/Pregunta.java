package GameConfig;

public class Pregunta {
    String descripcion;
    String opcA;
    String opcB;
    String opcC;
    String opcD;
    String opcCorrecta;

    public Pregunta() {
    }

    public Pregunta(String descripcion, String opcA, String opcB, String opcC, String opcD, String opcCorrecta) {
        this.descripcion = descripcion;
        this.opcA = opcA;
        this.opcB = opcB;
        this.opcC = opcC;
        this.opcD = opcD;
        this.opcCorrecta = opcCorrecta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getOpcA() {
        return opcA;
    }

    public String getOpcB() {
        return opcB;
    }

    public String getOpcC() {
        return opcC;
    }

    public String getOpcD() {
        return opcD;
    }

    public String getOpcCorrecta() {
        return opcCorrecta;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setOpcA(String opcA) {
        this.opcA = opcA;
    }

    public void setOpcB(String opcB) {
        this.opcB = opcB;
    }

    public void setOpcC(String opcC) {
        this.opcC = opcC;
    }

    public void setOpcD(String opcD) {
        this.opcD = opcD;
    }

    public void setOpcCorrecta(String opcCorrecta) {
        this.opcCorrecta = opcCorrecta;
    }

    @Override
    public String toString(){
        return ("descripcion: " +getDescripcion()+"\n opcA: " +getOpcA() + "\n opcB: " +getOpcB()
                +"\n opcC: " +getOpcC() + "\n opcD: " +getOpcD() + "\nOpcion Correcta: " +getOpcCorrecta()
        );
    }
}
