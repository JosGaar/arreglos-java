import java.util.Scanner;

public class EjemploArreglosBuscarNumero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];

        for (int i = 0; i < a.length; i++) {
            System.out.print("ingrese un numero: ");
            a[i] = sc.nextInt();
        }

        System.out.println("\r\ningres un numero a buscar: ");
        int num = sc.nextInt();

        int i = 0;
        while (i < a.length && a[i] != num) {
            i++;
        }

        if (i == a.length) {
            System.out.println("numero no encontrado");
        } else if (a[i] == num) {
            System.out.println("numero encontrado en la posicion " + i);
        }

    }
}
