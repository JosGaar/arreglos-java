public class EjemploArreglosForOrdenamientoBurbuja {
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

        // Arreglo de tipo int
        Integer[] numeros = new Integer[4];
        int largoNumeros = numeros.length;

        numeros[0] = 10;
        numeros[1] = 6;
        numeros[2] = 89;
        numeros[3] = 1;

        // Ordenamientos
        sortBurbuja(numeros);
        ordenamientoInverso(numeros);

        System.out.println("================== ordenado ==================");
        for (int i = 0; i < largoNumeros; i++) {
            System.out.println("para indice = " + i + " : " + numeros[i]);
        }

        // Arrays.sort(); // Orden de forma ascendiente, usando el metodo sort
        // Collections.reverse(Arrays.asList()); // Orden inverso usando el metodo reverse
    }


    // Ordenamiento de forma ascendente
    public static void sortBurbuja(Object[] arreglo) {

        int largoArreglo = arreglo.length;
        int contador = 0; // Ver cuantas veces itera

        for (int i = 0; i < largoArreglo - 1; i++) {
            // A medida que avanza el for del i, se van ordenando las posiciones superiores;
            // por tanto, se le resta i porque no hace falta volver a verificar que esten ordenados.
            for (int j = 0; j < largoArreglo - 1 - i; j++) {
                // Lo casteo porque el metodo compareTo solo puede ser usado con tipos de datos referencia
                if (((Comparable) arreglo[j + 1]).compareTo(arreglo[j]) < 0) { // Significa que arreglo[j + 1] es menor a arreglo[j]
                    Object axuiliar = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = axuiliar;
                }
                contador++;
            }
        }
        System.out.println("cantidad de veces iteradas = " + contador);
    }

    // Ordenamiento de forma descendiente
    public static void ordenamientoInverso(Object[] arreglo) {

        int largoArreglo = arreglo.length;
        int contador = 0; // Ver cuantas veces itera

        for (int i = 0; i < largoArreglo - 1; i++) {
            // A medida que avanza el for del i, se van ordenando las posiciones superiores;
            // por tanto, se le resta i porque no hace falta volver a verificar que esten ordenados.
            for (int j = 0; j < largoArreglo - 1 - i; j++) {
                // Lo casteo porque el metodo compareTo solo puede ser usado con tipos de datos referencia
                if (((Comparable) arreglo[j + 1]).compareTo(arreglo[j]) > 0) { // Significa que arreglo[j + 1] es mayor a arreglo[j]
                    Object axuiliar = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = axuiliar;
                }
                contador++;
            }
        }
        System.out.println("cantidad de veces iteradas = " + contador);
    }

}
