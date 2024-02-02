import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion2 {
    public static void main(String[] args) {

        // ejemplo para insetar un elemento en una posicion x (arreglo no ordenado),
        // pero sin agregar un elemento en la ultima posicion

        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int elemento, posicion;

        for (int i = 0; i < a.length - 1; i++) {
            System.out.print(" ingrese el numero: ");
            a[i] = sc.nextInt();
        }

        System.out.print("ingrese un nuevo elemento: ");
        elemento = sc.nextInt();

        System.out.print("ingrese la posicion en donde agregar el elemento (0-9): ");
        posicion = sc.nextInt();

        for (int i = a.length - 2; i >= posicion; i--) {
            a[i + 1] = a[i];
        }
        a[posicion] = elemento;

        System.out.println("arreglo desplazado: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
