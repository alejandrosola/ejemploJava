package ejemploObjetos;
import java.util.Scanner;
public class TestPersona {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nombre = scan.next();
        Persona alejandro = new Persona(nombre);
        alejandro.setNombre("Jorge");
        nombre = alejandro.getNombre();
        System.out.println(nombre);
        alejandro.hablar("Hola mundo!");
    }
}