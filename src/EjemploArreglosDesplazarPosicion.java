import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int ultimo;

        for (int i = 0; i < a.length; i++) {
            System.out.print(" ingrese el numero: ");
            a[i] = sc.nextInt();
        }

        // para desplazar una posicion se lo hace desde el final hacia el inicio
        ultimo = a[a.length - 1]; // guardamos el ultimo elemento
        for (int i = a.length - 2; i >= 0; i--) {
            a[i + 1] = a[i]; // empezamos a desplazar. El elemento anterior a[i] se almacena en el siguiente a[i + 1]
        }
        a[0] = ultimo; // asignamos el ultimo elemento (llave = a.length - 1) en el primer elemento (llave = 0)

        System.out.println("arreglo desplazado: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
