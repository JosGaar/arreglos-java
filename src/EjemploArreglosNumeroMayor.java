import java.util.Scanner;

public class EjemploArreglosNumeroMayor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];

        System.out.println("Ingrese cinco numeros");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int max = 0;
        for (int i = 1; i < a.length; i++) {
            // se devuelven los indices
            max = (a[max] > a[i]) ? max : i;
        }
        System.out.println("a[max] = " + a[max]);
        

    }
}
