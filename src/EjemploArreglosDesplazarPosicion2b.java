import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion2b {
    public static void main(String[] args) {

        // ejemplo, agregar un elemento en una posicion especifica (arreglo no ordenado),
        // pero agregando el ultimo elemento sin perderlo

        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int elemento, posicion, ultimo;

        for (int i = 0; i < a.length; i++) {
            System.out.print(" ingrese el numero: ");
            a[i] = sc.nextInt();
        }

        System.out.print("ingrese un nuevo elemento: ");
        elemento = sc.nextInt();

        System.out.print("ingrese la posicion en donde agregar el elemento (0-9): ");
        posicion = sc.nextInt();

        ultimo = a[a.length - 1]; // guardamos el ultimio elemento para no perderlo

        // desplazamos empezando desde la penultima posicion
        // teniendo como limite la posicion dada por el usuario
        for (int i = a.length - 2; i >= posicion; i--) {
            a[i + 1] = a[i];
        }

        // un arreglo con un elemento mas al de a
        int[] b = new int[a.length + 1];

        // copiamos los elementos de a en b
        System.arraycopy(a, 0, b, 0, a.length);

        // insertamos el elemento pedido en la posicion deseada
        b[posicion] = elemento;

        b[b.length - 1] = ultimo; // insetarmos el ultimo elemento de a en la ultima posicion de b


        System.out.println("arreglo desplazado: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
