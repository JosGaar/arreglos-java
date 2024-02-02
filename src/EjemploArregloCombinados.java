public class EjemploArregloCombinados {
    public static void main(String[] args) {

        int[] a, b, c;
        // la cantidad de elementos debe ser un multiplo de x numero
        a = new int[9];
        b = new int[9];
        c = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }

        for (int i = 0; i < b.length; i++) {
            b[i] = (i + 1) * 5;
        }

        int aux = 0;
        // el incremento debe ser el numero x, del cual se obtiene el multiplo en la cantidad de elementos
        for (int i = 0; i < b.length; i += 3) {
            for (int j = 0; j < 3; j++) {  // cantidad de veces a copiar en el arreglo c
                c[aux++] = a[i + j];
            }
            for (int j = 0; j < 3; j++) {
                c[aux++] = b[i + j];
            }
        }

        for (int i = 0; i < c.length; i++) {
            System.out.println("c" + i + " = " + c[i]);
        }

    }

}


