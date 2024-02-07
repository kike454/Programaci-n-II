import java.util.*;
import java.util.stream.Collectors;

public class Cuadrados {
    public static List<Integer> cuadrados(List<Integer> lista){
        return lista.stream().map(x->x*x).collect(Collectors.toList());
    }
    public static void main(String[] args){
        List<Integer> lista = new ArrayList<>();
        lista.add(4);
        lista.add(5);
        lista.add(6);
        System.out.println(cuadrados(lista));
    }
    
}
