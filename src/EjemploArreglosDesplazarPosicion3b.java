import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion3b {
    public static void main(String[] args) {

        // ejemplo para insetar un numero en un arreglo ordenado sin desordenarlo,
        // insertando un elemento en la ultima posicion sin perderlo

        Scanner sc = new Scanner(System.in);
        int[] a = new int[7];
        int numero, posicion, ultimo;

        for (int i = 0; i < a.length; i++) {
            System.out.print("ingrese un numero: ");
            a[i] = sc.nextInt();
        }

        System.out.print("ingrese un numero a insertar: ");
        numero = sc.nextInt();

        ultimo = a[a.length - 1];

        posicion = 0;

        // cuando la condicion ya no se cumpla, significa que encontramos la posicion
        // en la cual debemos insertar el numero
        while ((posicion < a.length - 1) && numero > a[posicion]) {
            posicion++;
        }

        for (int i = a.length - 2; i >= posicion; i--) {
            a[i + 1] = a[i];
        }

        int[] b = new int[a.length + 1];
        System.arraycopy(a, 0, b, 0, a.length);

        // en el caso de que el numero dado por el usuario sea mayor
        if (numero > ultimo) {
            // establecemos ese numero como el ultimo
            b[b.length - 1] = numero;
        } else {
            // caso contrario, ultimo sera el ultimo elemento y el numero se inserta en la posicion
            // deseada
            b[b.length - 1] = ultimo;
            b[posicion] = numero;
        }


        System.out.println("el nuevo arreglo ordenado es: ");
        for (int i = 0; i < b.length; i++) {
            System.out.println(i + " => " + b[i]);
        }

    }
}
