import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class DosListasPar {
    public static List<Integer> sumIt(List<Integer> array1){
        List<Integer> array2 = new ArrayList<>();
        for(int i=0;i<array1.size();i++){
            if(array1.get(i)%2==0)
            array2.add(array1.get(i));
        }
        return array2;
    }
    public static List<Integer> sumR(List<Integer> array1, int posicion, List<Integer> array2){
      // List<Integer> array2 = new ArrayList<>();
        if(posicion ==-1){
            return array2;
        }else{
            if(array1.get(posicion)%2==0) {
                array2.add(array1.get(posicion));
                return sumR(array1, posicion-1,array2);
            }
            else{
                return sumR(array1, posicion-1,array2);
            }
        }
    }
    public static List<Integer> subl(List<Integer> array1,List<Integer> array2){
        if(array1.isEmpty()){
            return array2;
        }else{
            if(array1.get(0)%2==0){
                array2.add(array1.get(0));
                return subl(array1.subList(1, array1.size()), array2);
            }else {
                return subl(array1.subList(1, array1.size()), array2);
            }
        }
        //return 0;
    }
    public static List<Integer> sumL(List<Integer> array1){
        List<Integer> lista = array1.stream().filter(p->p%2==0).collect(Collectors.toList());
        return lista;
    }
    public static void main(String[] args){
        List<Integer> array1 = new ArrayList<>();
        List<Integer> array2 = new ArrayList<>();
        array1.add(2);
        array1.add(4);
        for(int i=1;i<=10;i++){
            array1.add(i);
        }
        System.out.println(sumIt(array1));
        System.out.println(sumR(array1,array1.size()-1,array2));
        System.out.println(subl(array1,array2));
        System.out.println(sumL(array1));
    }
}
