package com.enrique.modelo;

import java.io.PrintWriter;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Analizador {
    /**
     * @param data: Dato de prueba para correr el análisis
     * @param F:    función a analizar
     * @param out:  Fichero de salida para el tiempode ejecución
     * @return resultado de la función a analizar
     */
    //mide e timepo que tarda el algoritmo en ejecutarse
    public static long[] analiza(long[] data, Function<long[], long[]> F, PrintWriter out) {
        long[] aux = data.clone();
        long inicio = System.nanoTime();
        F.apply(aux);
        long duracion = System.nanoTime() - inicio;
        out.print(duracion + "\t");
        return aux;
    }

    //hace lo mismo pero con algoritmos de bsuqueda
    public static long analizaBusqueda(long[] data, long e, BiFunction<long[], Long, Long> F, PrintWriter out) {
        long inicio = System.nanoTime();
        long p = F.apply(data, e);
        long duracion = System.nanoTime() - inicio;
        out.print(duracion + "\t");
        return p;
    }
}

