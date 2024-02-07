import java.util.*;
import java.util.stream.*;
public class ListPar {
    
    public static List<Integer> parIt(int numero){
        List<Integer> resul = new ArrayList<>();
        for(int i=0;i<=numero;i++){
            if(i%2==0){
                resul.add(i);
            }
        }
        return resul;
    }
    public static List<Integer> parLam(int numero){
       Stream<Integer> iterate = Stream.iterate(0, x-> x+1);
        List<Integer> res = iterate.limit(numero).filter(p->p%2==0).collect(Collectors.toList());
        return res;
    }
    public static List<Integer> parRec(int numero){
        List<Integer> resul = new ArrayList<>();
        
        if(numero<=2){
            resul.add(2);
            return resul;
        }else{
            if(numero%2==0){
               // System.out.println(numero);
                resul = parRec(numero-1);
                //resul.add(numero);
               // System.out.println(resul);
                //resul.add(parRec(numero));
                resul.add(numero);
                return resul;
            }else{
                return parRec(numero-1);
            } 
        }
    }
    public static void main(String[] args){
        System.out.println(parIt(9));
        System.out.println(parLam(9));
        System.out.println(parRec(9));
    }
}
