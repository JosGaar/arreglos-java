import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {

        // Arreglo de tipo String
        String[] productos = new String[7];
        int largoProductos = productos.length; // Es buena practica asignar el largo a una variable

        productos[0] = "Kinstong";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SDD";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generacion";
        productos[6] = "Bicicleta Oxford";

        Arrays.sort(productos); // Siempre hay que ordenar antes de iterar los elementos

        System.out.println("=== usando for ===");
        for (int i = 0; i <= largoProductos - 1; i++) {
            System.out.println("para indice = " + i + " : " + productos[i]);
        }

        System.out.println("=== usando for inverso 1 ===");
        for (int i = 0; i < largoProductos; i++) {
            System.out.println("para i = " + (largoProductos - 1 - i) + " valor : " + productos[largoProductos - 1 - i]);
        }

        System.out.println("=== usando for inverso 2 ===");
        for (int i = largoProductos - 1; i >= 0; i--) {
            System.out.println("para i = " + i + " valor : " + productos[i]);
        }


    }
}
