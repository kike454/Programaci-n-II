package pr2.org;

import java.util.*;
import java.util.stream.*;


/**union sin elementos repetidos 
 * array1 = {1,2,3,4,2,6};
 * array2={2,4,6};
 *resultado= 1,2,3,4,6
 */
public class App <E>
{
    public  List<E> unionIterativo(List<E> array1, List<E> array2){
       List<E> arrayResultado = new ArrayList<>();
        for(E number: array1){
            if(!arrayResultado.contains(number))
            arrayResultado.add(number);
        }
        for(E num : array2){
            if(!arrayResultado.contains(num))
            arrayResultado.add(num);
        }
        return arrayResultado;
    }
    /*public List<E> unionRecursivo(List<E> array1,List<E> array2, int posicion, int posicion2,List<E> arrayRes){
      //List<E> arrayRes = new ArrayList<>();
        
        if(posicion == -1  ){
            return arrayRes;
        }else{
              if(!arrayRes.contains(array1.get(posicion))){
                arrayRes.add(array1.get(posicion));
                  unionRecursivo(array1, array2,posicion-1,posicion2,arrayRes);
            }else{
                 unionRecursivo(array1, array2, posicion-1, posicion2,arrayRes);
            }
            if(!arrayRes.contains(array2.get(posicion2))){
                arrayRes.add(array2.get(posicion2));
              unionRecursivo(array1, array2,posicion,posicion2-1,arrayRes);
         }   
          else{
             unionRecursivo(array1, array2, posicion, posicion2-1,arrayRes);    
        }
        }  
    }*/
    //public List<E>
    public List<E> metodo(List<E> array1, List<E> array2){
       
        List<E> arrayEsp = new ArrayList<>();
        if(array1.isEmpty()) return new ArrayList<E>(array2);
        arrayEsp = metodo(array1.subList(1, array1.size()),array2);
        if(!arrayEsp.contains(array1.get(0))) arrayEsp.add(array1.get(0));

        return arrayEsp;  
    }
    public List<E> metodo2(List<E> array1, List<E> array2){
       
        List<E> arrayEsp = new ArrayList<>();
        if(array1.isEmpty()) return arrayEsp;
        arrayEsp = metodo2(array1.subList(1, array1.size()),array2);
       // arrayEsp = metodo2(array2.subList(1, array1.size()),array2);
        if(!arrayEsp.contains(array1.get(0))) arrayEsp.add(array1.get(0));
        if(!arrayEsp.contains(array2.get(0))) arrayEsp.add(array2.get(0));
        return arrayEsp;  
    }
    public List<E> unionLambda(List<E> array1, List<E> array2){
       // List<E> arrayAuxiliar = new ArrayList<>();
            List<E> arrayFinal = array1.stream().distinct().filter(x -> array2.contains(x)).collect(Collectors.toList());
           // List<E> arrayFinal1 = (List<E>) array2.stream().distinct().collect(Collectors.toList());
        return arrayFinal;
    }
}




    

