import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {

        // Los arreglos son mutables.

        // Arreglo de tipo String
        String[] productos = new String[7];

        productos[0] = "Kinstong";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SDD";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generacion";
        productos[6] = "Bicicleta Oxford";

        Arrays.sort(productos);

        String producto1 = productos[0];
        String producto2 = productos[1];
        String producto3 = productos[2];

        System.out.println("productos[0] = " + producto1);
        System.out.println("productos[1] = " + producto2);
        System.out.println("productos[2] = " + producto3);
        System.out.println("productos[3] = " + productos[3]);
        System.out.println("productos[4] = " + productos[4]);
        System.out.println("productos[5] = " + productos[5]);
        System.out.println("productos[6] = " + productos[6]);

        // Arreglo de tipo int
        int[] numeros = new int[4];

        numeros[0] = 10;
        numeros[1] = Integer.valueOf("2");
        numeros[2] = 9;
        numeros[3] = 5;

        Arrays.sort(numeros);

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[numeros.length - 1];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);

    }
}
