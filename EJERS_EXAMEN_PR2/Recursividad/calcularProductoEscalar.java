import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class calcularProductoEscalar {
    public static int prodIt(List<Integer> array1, List<Integer> array2){
        
        int res=0;
        //List<Integer> res = new ArrayList<>();
        for(int i=0;i<array1.size();i++){
            res += (array1.get(i) * array2.get(i));
        }
        return res;
    }
    public static int prodR(List<Integer> array1, List<Integer> array2, int posicion){
        int resul= 0;
        if(posicion ==-1){
            return resul;
        }else{
            return (array1.get(posicion) * array2.get(posicion)) + prodR(array1, array2, posicion-1);
        }  
    }
    public static int prodSub(List<Integer> array1, List<Integer> array2){
        if(array1.isEmpty()){
            return 0;
        }else{
            return array1.get(0) * array2.get(0) + prodSub(array1.subList(1, array1.size()), array2.subList(1, array2.size()));
        }
    }
    public static int prodLam(List<Integer> array1, List<Integer> array2){
        Stream<Integer> iterateStream = Stream.iterate(0, x -> x + 1);

        Integer r = iterateStream.limit(array1.size()).map(x -> array1.get(x) * array2.get(x)).reduce(0,(acumulador,elemento)-> acumulador+elemento);
        return r;
    }
    public static void main(String[] args){
        List<Integer> array1 = new ArrayList<>();
        List<Integer> array2 = new ArrayList<>();
        array1.add(1);
        array1.add(2);
        array1.add(3);
       // array1.add(4); 

       array2.add(2);
       array2.add(4);
       array2.add(6);
        System.out.println(prodIt(array1, array2));
        System.out.println(prodR(array1, array2,array1.size()-1));
        System.out.println(prodSub(array1, array2));
        System.out.println(prodLam(array1, array2));
    }


}
