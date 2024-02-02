import java.util.Scanner;

public class EjemploArreglosParesImpares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] a, pares, impares;
        int totalPares = 0, totalImpares = 0;
        a = new int[10];

        System.out.println("ingrese 10 numeros");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                totalPares++;
            } else {
                totalImpares++;
            }
        }

        pares = new int[totalPares];
        impares = new int[totalImpares];

        int contadorPares = 0, contadorImpares = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                pares[contadorPares++] = a[i];
            } else {
                impares[contadorImpares++] = a[i];
            }
        }

        System.out.println("Pares");
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i] + " ");
        }

        System.out.println("\r\nImpares");
        for (int i = 0; i < impares.length; i++) {
            System.out.print(impares[i] + " ");
        }
    }


}
