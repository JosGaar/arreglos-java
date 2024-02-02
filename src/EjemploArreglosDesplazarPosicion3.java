import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion3 {
    public static void main(String[] args) {

        // ejemplo para insetar un elemento en un arreglo ordenado sin desordenarlo,
        // pero sin insetar un elemento en la ultima posicion

        Scanner sc = new Scanner(System.in);
        int[] a = new int[7];
        int numero, posicion;

        for (int i = 0; i < a.length - 1; i++) {
            System.out.print("ingrese un numero: ");
            a[i] = sc.nextInt();
        }

        System.out.print("ingrese un numero a insertar: ");
        numero = sc.nextInt();

        posicion = 0;

        // cuando la condicion ya no se cumpla, significa que encontramos la posicion
        // en la cual debemos insertar el numero
        while ((posicion < a.length - 1) && numero > a[posicion]) {
            posicion++;
        }

        for (int i = a.length - 2; i >= posicion; i--) {
            a[i + 1] = a[i];
        }
        a[posicion] = numero;

        System.out.println("el nuevo arreglo ordenado es: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(i + " => " + a[i]);
        }

    }
}
