import java.util.*;
import java.util.stream.Stream;

public class ProductEsc {
    
    public static int ProdIt(List<Integer> array1,List<Integer>array2){
       
        int resprod=0;
        for(int i=0;i<array1.size();i++){//0(N)
           resprod += array1.get(i) * array2.get(i);// 1 +1,-> 0(1)
        }
        return resprod;//0(1), cuando acabe
        //0(N) + 0(1)
        

    }
    public static int prodRec(List<Integer>array1,List<Integer>array2){
        if(array1.isEmpty()){
            return 0;
        }else{
            return array1.get(0) * array2.get(0) + prodRec(array1.subList(1, array1.size()), array2.subList(1, array2.size()));
        }// 1 + 1,->0(1) + O(N)
    }
    public static int prodLam(List<Integer>array1,List<Integer>array2){
      // Stream stream = Stream.of(array1,array2);
        int indice=array2.get(0);
        Stream<Integer> str = Stream.iterate(0, x-> x+1);
        //int res = array1.stream().map(x-> x*array2.get()).reduce(0,(acumulador,elemento)-> acumulador + elemento);
        Integer res = str.limit(array1.size()).map(x-> array1.get(x)*array2.get(x)).reduce(0,(acumulador,elemento)-> acumulador + elemento);
        return res;
    }
    public static void main(String[] args){
        List<Integer> array1 = new ArrayList<>();
        List<Integer> array2 = new ArrayList<>();
        array1.add(1);
        array1.add(2);
        array1.add(3);
        array2.add(2);
        array2.add(4);
        array2.add(6);
        System.out.println(ProdIt(array1, array2));
        System.out.println(prodRec(array1, array2));
        System.out.println(prodLam(array1, array2));
    }
} 
