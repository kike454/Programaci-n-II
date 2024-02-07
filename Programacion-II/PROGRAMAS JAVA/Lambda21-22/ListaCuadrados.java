import java.util.*;
import java.util.stream.*;
public class ListaCuadrados {
    
    

    public static void main(String[] args){
        ArrayList<Integer> lista = new ArrayList<>();
        //lista.add(1);
        lista.add(20);
        lista.add(30);
        //lista.add(4);
        lista.add(5);
        //lista.add(60);
        ArrayList<String> lista2 = new ArrayList<>();
        lista2.add("KELOKE");
        lista2.add("maMaGuevo");
        lista2.add("D3 Corona");
        //EJERCICO 14 EXPR LAMBDA
        //1.obtener otra lista con los cuadrados 
        List<Integer> arrayEsperado = lista.stream().map(x-> x*x).collect(Collectors.toList());
        //2.obtener suma elementos lista
         Integer resultado = lista.stream().reduce(0,(num1,num2)-> num1+num2);
         //3.obtener suma cuadrados de una lista 
        Integer res = lista.stream().filter(n->n%2==0).reduce(0, (n1,n2) -> n1 + n2);
        //obtener otra lista con los nuemros pares 
        List<Integer> solucion = lista.stream().filter(x-> x%2==0).collect(Collectors.toList());
        //media aritmetica
        double media = lista.stream().reduce(0,(x,y)-> (x+y))/lista.size();
        //menor de una lista de numeros
        Integer menor = lista.stream().min((x1,x2) -> x1 -x2).get();
        //obtener lista sitring en minusculas
        List<String> minuscula = lista2.stream().map(String::toLowerCase).collect(Collectors.toList());
        //Concatenar todos elementos de una lista de Strings
        StringBuilder concat = lista2.stream().forEach().toString();
        System.out.println(arrayEsperado);//
        System.out.println(resultado);
        System.out.println(res);
        System.out.println(solucion);
        System.out.println(media);
        System.out.println(menor);
        System.out.println(minuscula);
        System.out.println(concat);
    }
   
}
