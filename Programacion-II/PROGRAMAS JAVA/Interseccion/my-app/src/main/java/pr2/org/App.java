package pr2.org;
import java.util.*;

/**array1 = {1,2,3,4,2,6};
 * array2={2,4,6};
 *resultado= 2,4,2,6
 */
public class App <E>{

    public List<E> Iterativo(List<E> array1, List<E> array2){
        List<E> arrayEsperado= new ArrayList<>();
        for(E numero: array1){
            if(array2.contains(numero))
                arrayEsperado.add(numero);
            
        }
        return arrayEsperado;
    }
    
        public  List<E> calcularInterseccionRecursiva(List<E> array1, List<E> array2){
            List<E> interseccion = new ArrayList<>();
            return calcularInterseccionRecursiva(array1, array2, interseccion);
        }
    
        private List<E> calcularInterseccionRecursiva(List<E> array1, List<E> array2, List<E> interseccion){
            // return null;
            if (array1.isEmpty()) return interseccion;
            else{ 
                E e = array1.get(0);
                if (array2.contains(e)) interseccion.add(e);
                return calcularInterseccionRecursiva(array1.subList(1, array1.size()), array2, interseccion);
            }
        } 
    }


  
   

    
    
    



    /*public void Lambda(List<V> array1, List<V> array2){
        
            List<V> resultado = array1.stream().filter(f ->array2.contains(f)).collect(Collectors.toList);
            
        return resultado;


            
    }*/
