import java.util.*;
import java.util.stream.*;
public class Ejer14 {
    
    public static void main(String[] args){
        List<Integer> array1 = new ArrayList<>();
        for(int i=0; i<=5;i++){
            array1.add(i);
        }
        List<String> array2 = new ArrayList<>();
        array2.add("HOLA");
        array2.add("AdiOS");
        array2.add("KELOke");

        //1. Dada una lista de números, obtiene otra lista con sus cuadrados.
        List <Integer> lista = array1.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println(lista);
        //2. Dada una lista de números, obtiene su suma.
        int suma = array1.stream().reduce(0,(acumulador,elemento)-> acumulador + elemento);
        System.out.println(suma);
        //Dada una lista de enteros, obtine la suma de los números pares.
        int pares = array1.stream().filter(p-> p%2==0).reduce(0,(acumulador,elemento)-> acumulador+ elemento);
        System.out.println(pares);
        //Dada una lista de enteros, obtine otra lista con los números pares de la lista inicial.
        List<Integer> parList = array1.stream().filter(x -> x%2==0).collect(Collectors.toList());
        System.out.println(parList);
        //La media aritmética de los elementos de una lista dada.
        double media = array1.stream().reduce(0,(acumulador, elemento)-> acumulador + elemento)/array1.size();
        System.out.println(media);
        //La desviación típica de los elementos de una lista dada.

        //El menor de una lista de números
        Integer menol = array1.stream().min((x,y)-> x-y).get();
        System.out.println(menol);
        //A partir de una lista de String, obtiene otra lista con sus elementos transformados a minúscula. La cabecera será la siguiente:
        List<String> str = array2.stream().map(palabra -> palabra.toLowerCase()).collect(Collectors.toList());
        System.out.println(str);
        //Devuelve una cadena que sea la concatenación de todos los elementos de una lista de String.
        System.out.println(array2.stream().collect(Collectors.joining("")));
        //Devuelve una lista con todos los elementos de otra lista de String que no empiezen por la letra ‘A’. La cabecera será la siguiente:
        List<String> noA = array2.stream().filter(x -> x.toLowerCase().charAt(0)!='a').collect(Collectors.toList());
        System.out.println(noA.toString());
        //resultado = listaPalabras.stream().filter(v -> v.toLowerCase().charAt(0)!='l').collect(Collectors.toList());
        //Devuelve una lista con todos los números mayores que seis resultantes de multiplicar por 2 todos los elementos de una lista de entrada.
        List<Integer> por2MayorQue6= array1.stream().map(x -> x*2).filter(p-> p > 6).collect(Collectors.toList());
        System.out.println(por2MayorQue6);
    }
}
