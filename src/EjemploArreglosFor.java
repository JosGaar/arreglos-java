import java.util.Arrays;

public class EjemploArreglosFor {
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

        System.out.println("=== usando for each ===");
        for (String producto : productos) {
            System.out.println("producto = " + producto);
        }

        System.out.println("=== usando un while ===");
        int i = 0;
        while (i <= largoProductos - 1) {
            System.out.println("para indice = " + i + " : " + productos[i]);
            i++;
        }

        System.out.println("=== usando un do while ===");
        int j = 0;
        do {
            System.out.println("para indice = " + j + " : " + productos[j]);
            j++;
        } while (j <= largoProductos - 1);

        // Arreglo de tipo int
        int[] numeros = new int[4];
        int largoNumeros = numeros.length;

        for (int k = 0; k < largoNumeros; k++) {
            numeros[k] = k * 3;
        }

        for (int k = 0; k < largoNumeros; k++) {
            System.out.println("numeros = " + numeros[k]);
        }

    }
}
