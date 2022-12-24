package ejemplos;

import java.util.Scanner;
public class Arrays2 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        // Pedir cantidad de nombres y crear un array
        System.out.print("Cuantos nombres queres guardar? ");
        int n = scanner.nextInt();
        String[] nombres = new String[n];

        // Pedir los nombres
        for (int i = 0; i < n; i++) {
            System.out.printf("Ingrese el nombre %d\n", i);
            nombres[i] = scanner.next();
        }

        // Mostrar los nombres ingresados por el usuario
        System.out.println("Escribiste los nombres: ");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }

    }

}
