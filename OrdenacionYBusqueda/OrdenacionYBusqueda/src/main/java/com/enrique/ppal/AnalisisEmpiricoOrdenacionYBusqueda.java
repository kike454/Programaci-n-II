package com.enrique.ppal;

import com.enrique.modelo.Analizador;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Stream;

public class AnalisisEmpiricoOrdenacionYBusqueda {

    /**
     * Análisis empírico de los algoritmos de ordenación y búsqueda.
     * Ejemplares: array de elementos aleatorios, array oredenado y array en orden inverso. Tamaños 100, 1000, 10000, 100000, 1000000, 10000000.
     * El resultado del análisis, los tiempos de ejecución de los algoritmos para los distintos ejemplares, se graba en el fichero tiempos.txt, en el directorio del proyecto
     */
    public static void desordena(long[] L) {
        Random random = new Random(L.length);//intercambia posiciones al azar
        for (int i = 0; i < L.length; i++) {//recorre el vector
            int p = random.nextInt(L.length);//elegir que posicion quiere intercambiar
            long aux = L[i];//numero que quieres cambiar de posicion, la guardas en otra variable
            L[i] = L[p];//cambia el nuemro de poscion
            L[p] = aux;//asigan el numero a la posucion
        }
    }

    public static long[] quicksort(long[] A, int izq, int der) {
        long pivote = A[izq]; // tomamos primer elemento como pivote
        int i = izq;         // i realiza la búsqueda de izquierda a derecha
        int j = der;         // j realiza la búsqueda de derecha a izquierda
        long aux;

        while (i < j) {                          // mientras no se crucen las búsquedas
            while (A[i] <= pivote && i < j) i++; // busca elemento mayor que pivote
            while (A[j] > pivote) j--;           // busca elemento menor que pivote
            if (i < j) {                        // si no se han cruzado
                aux = A[i];                      // los intercambia
                A[i] = A[j];
                A[j] = aux;
            }
        }

        A[izq] = A[j];      // se coloca el pivote en su lugar de forma que tendremos
        A[j] = pivote;      // los menores a su izquierda y los mayores a su derecha

        if (izq < j - 1)//
            quicksort(A, izq, j - 1);          // ordenamos subarray izquierdo
        if (j + 1 < der)
            quicksort(A, j + 1, der);          // ordenamos subarray derecho
        return A;
    }

    public static long[] mergesort(long[] A, int izq, int der) {
        if (izq < der) {
            int m = (izq + der) / 2;
            mergesort(A, izq, m);
            mergesort(A, m + 1, der);
            merge(A, izq, m, der);
        }
        return A;
    }

    public static long[] merge(long[] A, int izq, int m, int der) {
        int i, j, k;
        long[] B = new long[A.length]; //array auxiliar
        for (i = izq; i <= der; i++)      //copia ambas mitades en el array auxiliar
            B[i] = A[i];

        i = izq;
        j = m + 1;
        k = izq;

        while (i <= m && j <= der) //copia el siguiente elemento más grande
            if (B[i] <= B[j])
                A[k++] = B[i++];
            else
                A[k++] = B[j++];

        while (i <= m)         //copia los elementos que quedan de la
            A[k++] = B[i++]; //primera mitad (si los hay)
        return A;
    }

    public static void AnalisisEmpiricoOrdenacionYBusqueda() {

        Function<long[], long[]> BubbleSort = L -> {
            for (int i = 1; i < L.length; i++)
                for (int j = L.length - 1; j >= i; j--)
                    if (L[j - 1] > L[j]) {
                        long Aux = L[j];
                        L[j] = L[j - 1];
                        L[j - 1] = Aux;
                    }
            return L;
        };

        Function<long[], long[]> SelectSort = L -> {
            for (int i = 0; i < L.length - 1; i++) {
                int pmin = i; //Es la posicion del elemento mínima entre i y length -1
                for (int j = i + 1; j < L.length; j++)
                    if (L[j] < L[pmin]) {
                        pmin = j;
                    }
                long aux = L[pmin];
                L[pmin] = L[i];
                L[i] = aux;
            }
            return L;
        };

        Function<long[], long[]> InserccionDirecta = L -> {
            for (int i = 1; i < L.length; i++) {
                long carta = L[i];
                int j = i - 1;
                while (j >= 0 && L[j] > carta) {
                    L[j + 1] = L[j];
                    j = j - 1;
                }
                L[j + 1] = carta;
            }
            return L;
        };

        BiFunction<long[], Long, Long> BusquedaLineal = (x, y) -> {
            int i = 0;
            while (i < x.length && x[i] != y) {
                i++;
            }
            return Long.valueOf(i < x.length && x[i] == y ? i : -1);
        };

        BiFunction<long[], Long, Long> BusquedaBinaria = (L, e) -> {
            int izquierda = 0;
            int derecha = L.length - 1;

            while (izquierda <= derecha) {
                int central = ((izquierda + derecha) / 2);
                if (L[central] > e) {
                    derecha = central - 1;
                } else if (L[central] < e) {
                    izquierda = central + 1;
                } else {
                    return Long.valueOf(central);
                }
            }
            return Long.valueOf(-1);
        };

        Function<long[], long[]> MergeSort = L ->
                mergesort(L, 0, L.length - 1);


        Function<long[], long[]> QuickSort = L ->
                quicksort(L, 0, L.length - 1);


        long[][] JuegoPruebasAleatorio = new long[6][];
        long[][] JuegoPruebasOrdenado = new long[6][];
        long[][] JuegoPruebasInverso = new long[6][];
        long tam = 10;

        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            JuegoPruebasAleatorio[i] = Stream.iterate((long) 0, x -> x + 1).limit(tam).mapToLong(x -> x).toArray();
            desordena(JuegoPruebasAleatorio[i]);
            JuegoPruebasOrdenado[i] = Stream.iterate((long) 0, x -> x + 1).limit(tam).mapToLong(x -> x).toArray();
            JuegoPruebasInverso[i] = Stream.iterate(tam - 1, x -> x - 1).limit(tam).mapToLong(x -> x).toArray();
            tam *= 10;
        }

        try {

            tam = 10;
            FileWriter fichero = new FileWriter("tiempos.txt");
            PrintWriter out = new PrintWriter(fichero);
            long[] resultado;
            out.println("BubbleSort");
            for (int i = 0; i < 4; i++) {
                out.print(tam + "\t");
                resultado = Analizador.analiza(JuegoPruebasAleatorio[i], BubbleSort, out);

                resultado = Analizador.analiza(JuegoPruebasOrdenado[i], BubbleSort, out);

                resultado = Analizador.analiza(JuegoPruebasInverso[i], BubbleSort, out);

                out.println();
                tam *= 10;
            }
            out.println("SelectSort");
            tam = 10;
            for (int i = 0; i < 4; i++) {
                out.print(tam + "\t");
                resultado = Analizador.analiza(JuegoPruebasAleatorio[i], SelectSort, out);

                resultado = Analizador.analiza(JuegoPruebasOrdenado[i], SelectSort, out);

                resultado = Analizador.analiza(JuegoPruebasInverso[i], SelectSort, out);

                out.println();
                tam *= 10;
            }
            out.println("InsercciónDirecta");
            tam = 10;
            for (int i = 0; i < 4; i++) {
                out.print(tam + "\t");

                resultado = Analizador.analiza(JuegoPruebasAleatorio[i], InserccionDirecta, out);

                resultado = Analizador.analiza(JuegoPruebasOrdenado[i], InserccionDirecta, out);

                resultado = Analizador.analiza(JuegoPruebasInverso[i], InserccionDirecta, out);

                out.println();
                tam *= 10;
            }
            out.println("MergeSort");
            tam = 10;
            for (int i = 0; i < 4; i++) {
                out.print(tam + "\t");
                resultado = Analizador.analiza(JuegoPruebasAleatorio[i], MergeSort, out);

                resultado = Analizador.analiza(JuegoPruebasOrdenado[i], MergeSort, out);

                resultado = Analizador.analiza(JuegoPruebasInverso[i], MergeSort, out);

                out.println();
                tam *= 10;
            }
            out.println("QuickSort");
            tam = 10;
            for (int i = 0; i < 4; i++) {
                out.print(tam + "\t");

                resultado = Analizador.analiza(JuegoPruebasAleatorio[i], QuickSort, out);


                resultado = Analizador.analiza(JuegoPruebasOrdenado[i], QuickSort, out);


                resultado = Analizador.analiza(JuegoPruebasInverso[i], QuickSort, out);

                out.println();
                tam *= 10;
            }
            out.println("BusquedaLineal");
            tam = 10;
            long presultado;
            for (int i = 0; i < 4; i++) {
                out.print(tam + "\t");

                presultado = Analizador.analizaBusqueda(JuegoPruebasAleatorio[i], random.nextInt(JuegoPruebasAleatorio.length), BusquedaLineal, out);


                presultado = Analizador.analizaBusqueda(JuegoPruebasOrdenado[i], random.nextInt(JuegoPruebasAleatorio.length), BusquedaLineal, out);


                presultado = Analizador.analizaBusqueda(JuegoPruebasInverso[i], random.nextInt(JuegoPruebasAleatorio.length), BusquedaLineal, out);

                out.println();
                tam *= 10;
            }
            out.println("BusquedaBinaria");
            tam = 10;
            long presultado2;
            for (int i = 0; i < 4; i++) {
                out.print(tam + "\t");

                presultado2 = Analizador.analizaBusqueda(JuegoPruebasAleatorio[i], random.nextInt(JuegoPruebasAleatorio.length), BusquedaBinaria, out);

                presultado2 = Analizador.analizaBusqueda(JuegoPruebasOrdenado[i], random.nextInt(JuegoPruebasAleatorio.length), BusquedaBinaria, out);

                presultado2 = Analizador.analizaBusqueda(JuegoPruebasInverso[i], random.nextInt(JuegoPruebasAleatorio.length), BusquedaBinaria, out);

                out.println();
                tam *= 10;
            }
            out.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
        System.out.print("Fin");
    }
}

