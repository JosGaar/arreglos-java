import java.util.Scanner;

public class EjemploArreglosEliminarElemento {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];

        for (int i = 0; i < a.length; i++) {
            System.out.print("ingrese un numero: ");
            a[i] = sc.nextInt();
        }

        System.out.print("digite una posicion para eliminar (0-9): ");
        int posicion = sc.nextInt();

        // empezamos desde la posicion que nos diga el usuario y empezamos a desplazar
        // para eliminar el elemento en esa posicion
        for (int i = posicion; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }

        int[] b = new int[a.length - 1];
        // copiamos el arreglo a, desde 0, hacia el arreglo b, empezando desde cero, con un largo de b.length
        System.arraycopy(a, 0, b, 0, b.length);

        for (int i = 0; i < b.length; i++) {
            System.out.println("b" + i + " : " + b[i]);
        }

    }
}
