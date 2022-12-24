package ejemploObjetos;

public class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void hablar(String mensaje) {
        System.out.println("La persona " + this.nombre + " dice: " + mensaje);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
