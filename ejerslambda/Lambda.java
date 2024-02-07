import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Lambda{
    public static void main(String[] args){

    
Integer[] arrayNumeros = new Integer[]{1,2,3,4};
String[] arrayPalabras = new String[]{"En", "Un", "Lugar", "De", "La", "Mancha"};
List<Integer> listaNumeros = Arrays.asList(arrayNumeros); // tranformar un array a una lista
List<String> listaPalabras = Arrays.asList(arrayPalabras);



// 1. Dada una lista de numeros, obtiene otra lista con sus cuadrados.
        String resultao = listaNumeros.stream().map(v -> Math.pow(v,2)).collect(Collectors.toList()).toString();
        System.out.println(resultao);
        
        
        
// 2. Dada una lista de nÃºmeros, obtiene su suma.
         System.out.println("\n-----2-----");
         //Integer suma = listaNumeros.stream().reduce(0, (a, b) -> a + b);
         //suma = listaNumeros.stream().reduce(0, Integer::sum);
         //System.out.println(suma);
         Integer suma = listaNumeros.stream().reduce(0, (a, b) -> a + b);
         
         //System.out.prtinln(suma);

         
 // 3. Dada una lista de enteros, obtine la suma de los nÃºmeros pares.
         System.out.println("\n-----3-----");
         //Integer sumaPares = listaNumeros.stream().filter(v -> v%2 == 0).reduce(0, Integer::sum);
         //System.out.println(sumaPares);
         Integer sumap = listaNumeros.stream().filter(v -> v%2==0).reduce(0, (a,b) -> a +b);
         System.out.println(sumap);
         
 // 4. Dada una lista de enteros, obtine otra lista con los nÃºmeros pares de la lista inicial.
         System.out.println("\n-----4-----");
         List<Integer> listaPares = listaNumeros.stream().filter(v -> v%2 == 0).collect(Collectors.toList());
         listaPares.stream().forEach(System.out::println);
 
 // 5. La media aritmÃ©tica de los elementos de una lista dada. si quieres convertor un int en un double, mapToDouble
         System.out.println("\n-----5-----");
         Double media = listaNumeros.stream().mapToDouble(i -> i).average().orElse(Double.MIN_VALUE);
         System.out.println(media);
        
         double media2= listaNumeros.stream().reduce( 0, (a,b) -> a+b);
         System.out.println(media2/listaNumeros.size());
 
  // 6. La desviaciÃ³n tÃ­pica de los elementos de una lista dada.
         System.out.println("\n-----6-----");
         Double desviacion = listaNumeros.stream().mapToDouble(v -> Math.pow(v-media, 2)).reduce(0, Double::sum)/listaNumeros.size();
         System.out.println(Math.sqrt(desviacion));
 
 // 7. El menor de una lista de nÃºmeros.
         System.out.println("\n-----7-----");
         Integer min = listaNumeros.stream().mapToInt(v -> v).min().orElseThrow(NoSuchElementException::new);
         Integer minim = listaNumeros.stream().mapToInt(v -> v).min().orElseThrow(NoSuchElementException ::new);
         //min = listaNumeros.stream().min(Comparator.comparing(Integer::valueOf)).orElseThrow(NoSuchElementException::new);
         System.out.println(min);
 
 // 8. A partir de una lista de String, obtiene otra lista en minÃºscula.
         System.out.println("\n-----8-----");
         List<String> resultado = listaPalabras.stream().map(String::toLowerCase).collect(Collectors.toList());
         System.out.println(resultado);
 
// 9. A partir de una lista de String, obtiene la concatenacion
         System.out.println("\n-----9-----");
         System.out.println(listaPalabras.stream().collect(Collectors.joining("")));
 
// 11. A partir de una lista de String, obtiene la lista sin palabras que empiezan por una letra
         System.out.println("\n-----11-----");
         resultado = listaPalabras.stream().filter(v -> v.toLowerCase().charAt(0)!='l').collect(Collectors.toList());
         System.out.println(resultado.toString());
     }
    }
