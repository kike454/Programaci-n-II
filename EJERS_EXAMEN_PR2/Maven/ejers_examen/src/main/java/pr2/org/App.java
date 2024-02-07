package pr2.org;
import java.util.*;
import java.util.stream.Collectors;
/**
 * UNION,INTERSECCION Y DIFERENCIA NETRE 2 ARRAYS
 *
 */
public class App <E>
{
    public List<E> interseccionIt(List<E> array1, List<E> array2){
       List<E> resultado = new ArrayList<>();
        for(E v: array1){
            if(array2.contains(v)){
                resultado.add(v);
            }
        }
        return resultado;
    }
    public List<E> interseccionRecur(List<E> array1, List<E> array2){
       List<E> resul1 = new ArrayList<>();
        if(array1.isEmpty()){
            return resul1;
        }else{
            //resul1 = array1.subList(1,array1.size()); 
            if(array2.contains(array1.get(0))){
                resul1.add(array1.get(0));
                return interseccionRecur(array1.subList(1,array1.size()), array2);
            }else{
                return interseccionIt(array1.subList(1, array1.size()), array2);
            }
           
        }
    
    }
    public List<E> interseccionLam(List<E> array1, List<E> array2){
        List<E> resul2= array1.stream().filter(p-> array2.contains(p)).collect(Collectors.toList());
        return resul2;
    }
    //*****UNION *******/
    public List<E> unionIt(List<E> array1, List<E> array2){
        List<E> resul = new ArrayList<>();  
        for(E e:array1){
                if(!resul.contains(e)){
                    resul.add(e);
                }
            }
        for(E o: array2){
            if(!resul.contains(o)){
                resul.add(o);
            }
        }
        return resul;
    }
    public List<E> unionRec(List<E> array1, List<E> array2){
       List<E> arr = new ArrayList<>();
      
       //arr = unionRec(array1,array2.subList(1,array2.size()));
       if(array1.isEmpty()){
        return arr;
       }else{
        arr = unionRec(array1.subList(1,array1.size()),array2);
        if(!arr.contains(array1.get(0))){
            arr.add(array1.get(0));
            //return unionRec(array1.subList(1,array1.size()), array2);
        }
       }

       if(array2.isEmpty()){
           return arr;
       }else{
        if(!arr.contains(array2.get(0))){
            arr.add(array2.get(0));
            return unionRec(array1,array2.subList(1,array2.size()));
        }
       }
       return arr;
        //return null;
    }
   /* public List<E> unionLam(List<E> array1, List<E> array2){
       
        List<E> res = array1.stream().filter(p-> !res.contains(array1.get(0))).collect(Collectors.toList());
        return null;

    }*/
}
