import java.util.*;
import java.util.stream.sum;
public class Sumatorio {
    public static int suma(List<Integer> lista){
        return lista.stream().reduce(0,(a,b) -> a + b);
        //return lista.stream().sum(); ¡¡PREGUNTAR!!
        //metodos reduce ya implementados:sum(),max(),min(),average(),count()
    }
    public static void main(String[] args){
        List<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        System.out.println(suma(lista));
    }
    
}
