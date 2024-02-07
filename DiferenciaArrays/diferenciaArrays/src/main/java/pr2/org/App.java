package pr2.org;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App <V>
{
   public List<V> diferenciaArrays(List<V> array1, List<V> array2){
      List<V> resul = new ArrayList<>();
      for(int i=0; i<=array1.size()-1;i++){
         boolean encontrado=false;
        // System.out.println("Busuqeda primer elemnto:" + array1.get(i));;
         for(int q=0; q<=array2.size()-1;q++){
            if(array1.get(i)== array2.get(q)){
               encontrado =true;//coges elemento arrray1, que no esta en el rray2 , lo añades,para cada valor de i la q toma todos lo valores 
            }
         }
         if(encontrado==false){
            resul.add(array1.get(i));
         }
      }
      for(int i=0; i<=array2.size()-1;i++){
         boolean encontrado1=false;
         for(int q=0; q<=array1.size()-1;q++){
            if(array2.get(i)== array1.get(q)){
               encontrado1 =true;//toods los del array2 quer no esten en el 1 los añades al resultado 
            }
         }
         if(encontrado1==false){
            resul.add(array2.get(i));
         }
      }
      return resul;
  }
  public List<V> diferenciaRecur(List<V> array1, List<V> array2){
   List<V> resul = new ArrayList<>(); 
   if(array1.isEmpty()){
      return new ArrayList<V>(array2);
   }else{
      if(array2.contains(array1.get(0))){
         return diferenciaRecur(array1.subList(1,array1.size()), array2);
      }else{
         resul = diferenciaArrays(array1.subList(1,array1.size()), array2);
         resul.add(array1.get(0));
         return  resul;
      }
      
   }
   

   //return null;
  }
}
