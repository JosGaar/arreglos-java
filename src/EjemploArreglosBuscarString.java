import java.util.Scanner;

public class EjemploArreglosBuscarString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] a = new String[5];

        for (int i = 0; i < a.length; i++) {
            System.out.print("ingrese el texto: ");
            a[i] = sc.nextLine();
        }

        System.out.println("\r\ningrese el texto a buscar: ");
        String texto = sc.nextLine();

        int i = 0;
        // va a repetir hasta que recorra todo el arreglo y los textos a buscar sean diferentes
        for (; i < a.length && !a[i].equalsIgnoreCase(texto); i++) {};

        if (i == a.length) {
            System.out.println("no se ha encontrado el texto.");
        } else if (a[i].toLowerCase().compareTo(texto.toLowerCase()) == 0) {
            System.out.println("encnotrado en la posicion: " + i);
        }

    }
}
