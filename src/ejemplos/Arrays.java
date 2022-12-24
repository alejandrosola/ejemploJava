package ejemplos;

public class Arrays {

    public static void main(String args[]) {

        // Creo un array con espacio para 3 nombres
        String[] nombres = new String[3];

        // Guardo nombres en el array
        nombres[0] = "Alejandro";
        nombres[1] = "Jorge";
        nombres[2] = "Pepe";

        // Muestro todos los nombres con sus posiciones
        for (int i = 0; i < nombres.length; i++) {
            System.out.printf("Nombre en la posicion %d: %s \n", i, nombres[i]);
        }

    }

}
