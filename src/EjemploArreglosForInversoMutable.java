import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {
    public static void main(String[] args) {

        // Arreglo de tipo String
        String[] productos = new String[7];
        int largoProductos1 = productos.length; // Es buena practica asignar el largo a una variable

        productos[0] = "Kinstong";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SDD";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generacion";
        productos[6] = "Bicicleta Oxford";

        Arrays.sort(productos); // Orden de forma ascendiente (menor a mayor), usando el metodo sort

        System.out.println("=== ordenado ===");
        for (int i = 0; i <= largoProductos1 - 1; i++) {
            System.out.println("para indice = " + i + " : " + productos[i]);
        }

        arregloInverso(productos); // Orden de forma descendiente (mayor a menor), implementada por nosotros
        // Collections.reverse(Arrays.asList(productos)); // Orden inverso usando el metodo reverse

        System.out.println("=== inverso ===");
        for (int i = 0; i <= largoProductos1 - 1; i++) {
            System.out.println("para indice = " + i + " : " + productos[i]);
        }
    }

    public static void arregloInverso(String[] productos) {
        int largoProductos1 = productos.length;
        int largoProductos2 = productos.length;
        for (int i = 0; i < largoProductos2; i++) {
            String actual = productos[i];
            String inverso = productos[largoProductos1 - 1 - i];

            productos[i] = inverso;
            productos[largoProductos1 - i - 1] = actual;
            largoProductos2--;
        }
    }

}
