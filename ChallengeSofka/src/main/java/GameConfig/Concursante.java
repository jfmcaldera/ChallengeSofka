package GameConfig;

public class Concursante {
    private String nombre;
    private String documento;
    private int edad;
    private String email;

    public Concursante() {
    }

    public Concursante(String nombre, String documento, int edad, String email) {
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
