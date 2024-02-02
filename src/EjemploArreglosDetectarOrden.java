import java.util.Scanner;

public class EjemploArreglosDetectarOrden {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] a = new int[7];

        System.out.println("ingrese 7 numeros");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        boolean ascendente = false;
        boolean descendiente = false;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                descendiente = true;
            }

            if (a[i] < a[i + 1]){
                ascendente = true;
            }
        }

        if (ascendente && descendiente) {
            System.out.println("Arreglo desordenado");
        }

        if (ascendente == false && descendiente == false) {
            System.out.println("Son todos iguales");
        }

        if (ascendente == true && descendiente == false) {
            System.out.println("Arreglo ordenado de menor a mayor");
        }

        if (ascendente == false && descendiente == true) {
            System.out.println("Arreglo ordenado de mayor a menor");
        }
    }
}
